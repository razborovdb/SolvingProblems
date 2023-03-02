package codesignal.d01102023.task3;

import java.util.HashMap;
import java.util.Map;

public class Task3 {

    public static void main(String[] args) {
//        int[][] field = new int[][] {
//                {0, 0, 0},
//                {0, 0, 0},
//                {0, 0, 0},
//                {1, 0, 0},
//                {1, 1, 0}
//        };
//        int[][] figure = new int[][] {
//                {0, 0, 1},
//                {0, 1, 1},
//                {0, 0, 1}
//        };
//        //System.out.println(solution(field, figure));
//        ////////////////////////////////////////////////////////
//        field = new int[][] {
//                {0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0},
//                {1, 1, 0, 1, 0},
//                {1, 0, 1, 0, 1}
//        };
//        figure = new int[][] {
//                {1, 1, 1},
//                {1, 0, 1},
//                {1, 0, 1}
//        };
//
//        ////////////////////////////////////////////////////////
//        field = new int[][] {
//                {0, 0, 0, 0},
//                {0, 0, 0, 0},
//                {0, 0, 0, 0},
//                {1, 0, 0, 1},
//                {1, 1, 0, 1}
//        };
//        figure = new int[][] {
//                {1, 1, 0},
//                {1, 0, 0},
//                {1, 0, 0}
//        };
//
//        System.out.println(solution(field, figure));

        Map<Integer, Integer> map = new HashMap<>();


        Map<Integer, Integer> map2 = new HashMap<>();

        System.out.println(map.equals(map2));



    }

    public String minWindow(String s, String t) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        String result = "";
        Map<Character, Integer> mapT = new HashMap<>();
        for (char c: charT) {
            if (mapT.containsKey(c)) {
                mapT.put(c, mapT.get(c) + 1);
            } else {
                mapT.put(c, 1);
            }
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < charS.length - charT.length + 1 ; i++) {
            map = new HashMap<>();
            for (int j = i; j < charS.length; j++) {
                char c = charS[j];
                int isExist = ifExist(charS[j], charT);

                if (isExist >= 0) {
                    if (map.containsKey(c)) {
                        if (mapT.get(c) > map.get(c)) {
                            map.put(c, map.get(c) + 1);
                        }
                    } else {
                        map.put(c, 1);
                    }

                    //System.out.println(set.size());
                    if (map.equals(mapT)) {
                        String curStr = s.substring(i,j+1);

                        if (curStr.length() < result.length() || result.equals("")) {
                            result = s.substring(i,j+1);
                        }
                        map.clear();
                        break;
                    }
                }
            }

        }
        return result;
    }
    public int ifExist(char c,char[] charT) {


        for (int i = 0; i < charT.length; i++) {
            if (charT[i] == c) {
                return i;
            }
        }
        return -1;
    }

    public static void print(int[][] nums) {
        for (int i[]: nums) {
            for (int j: i) {
                System.out.print(j + "; ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int solution(int[][] field, int[][] figure) {
        int[] fieldColDepth = new int[field[0].length];
        int[] figureColDepth = new int[figure[0].length];
        int[][] testMatrix = new int[field.length][field[0].length];
        int maxCount = 0;
        int dropIndex = -1;

        for (int j = 0; j < field[0].length; j++) {
            int depth = -1;
            for (int i = 0; i < field.length; i++) {
                if (field[i][j] == 1) {
                    depth = i;
                    break;
                }
            }
            fieldColDepth[j] = depth;
        }
        for (int j = 0; j < figure[0].length; j++) {
            int depth = -1;
            for (int i = 0; i < figure.length; i++) {
                if (figure[i][j] == 1) {
                    depth = i;
                }
            }
            figureColDepth[j] = depth;
        }

        for (int j = 0; j <= field[0].length - figure[0].length; j++) {
            int startRow = -1;
            for (int i = 0; i < figureColDepth.length; i++) {
                if (figureColDepth[i] == -1 || fieldColDepth[i+j] == -1) {
                    continue;
                }
                int val = fieldColDepth[i+j] - figureColDepth[i] - 1;
                if (val >= 0) {
                    if (startRow == -1) {
                        startRow = val;
                    }
                    if (val < startRow) {
                        startRow = val;
                    }
                }
            }
            if (startRow == -1) {
                startRow = field.length - figure.length;
            }

            for (int ii = 0; ii < field.length; ii++) {
                for (int jj = 0; jj < field[0].length; jj++) {
                    testMatrix[ii][jj] = field[ii][jj];
                    if (ii >= startRow && ii < startRow + figure.length && jj >= j && jj < j + figure[0].length) {
                        testMatrix[ii][jj] = testMatrix[ii][jj] | figure[ii- startRow][jj-j];
                    }
                }
            }
            print(testMatrix);
            int curCount = 0;

            for (int ii = 0; ii < field.length; ii++) {
                boolean b = true;
                for (int jj = 0; jj < field[0].length; jj++) {

                    if (testMatrix[ii][jj] == 0) {
                        b = false;
                        break;
                    }


                }
                if (b) {
                    curCount++;

                }
            }

            if (curCount > maxCount) {
                maxCount = curCount;
                dropIndex = j;
            }

        }
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();
        return dropIndex;
    }
}
