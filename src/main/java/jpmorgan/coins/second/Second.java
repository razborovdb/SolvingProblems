package jpmorgan.coins.second;

public class Second {
    public static void main(String[] args) {
        // int[] {0, 1, 1, 1, 0, 1, 1, 0}
        // 0, 1, 1, 1, 0, 0 , 1,1 , 0, 1,1,1,1

        int[] a = new int[] {0, 1, 1, 1, 0, 1, 1, 0};
        System.out.println(solution2(a));

        a = new int[] {0, 1, 1, 1, 0, 0 , 1, 1, 0, 1,1,1,1, 0, 1,1,1,1};
        System.out.println(solution2(a));


    }

    public static int solution2(int[] a) {
        int sum = 0;
        int sum2 = 0;
        int i = 0;
        int numZero = 0;
        int max = 0;
        while(i < a.length) {
            if (a[i] != 0) {
                if (numZero == 0) {
                    sum++;
                }
                if (numZero == 1) {
                    sum2++;
                }
            } else {
                numZero++;

                if (numZero == 2) {
                    if (max < (sum+sum2)) {
                        max = sum + sum2;
                    }
                    if(sum2 == 0) {
                        sum = 0;
                        numZero = 0;
                    } else {
                        numZero = 1;
                        sum = sum2;
                        sum2 = 0;
                    }
                }
            }
            i++;
        }
        if (max < (sum+sum2)) {
            max = sum + sum2;
        }
        return max;
    }


    public static int solution(int[] a) {
        int i = 0;
        int max = 0;
        int start = 0;
        while (start < a.length) {
            if(a[start] == 1) continue;
            int[] a2 = new int[a.length - 1];
            int index = 0;
            for (int j = 0; j < a.length; j++) {
                if (j != start) {
                    a2[index] = a[j];
                    index++;
                }
            }
            i = 0;

            while (i < a2.length) {

                int sum = 0;
                while (i < a2.length && a2[i] == 1) {
                    sum++;
                    i++;
                }
                i++;
                if (max < sum) {
                    max = sum;
                }
            }
            start++;
        }





        return max;
    }
}
