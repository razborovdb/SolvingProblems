package leetcode.ZigzagConversion;

public class ZigzagConversion {

    public static void main(String[] args) {
        // answer: PINALSIGYAHRPI
        String s = "PAYPALISHIRING";
        int numRows = 4;

        System.out.println(convert(s,numRows));
    }

    public static String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }
        String[] listString = new String[numRows];
        for(int i=0; i < listString.length; i++) {
            listString[i] = "";
        }

        int curIndex = -1;
        boolean directionUp = true;
        for (int i=0; i< s.length();i++) {
            if (directionUp) {
                curIndex++;
            } else {
                curIndex--;
            }

            if (curIndex>=numRows) {
                curIndex = numRows-2;
                directionUp = false;
            }

            if (curIndex<0) {
                curIndex = 1;
                directionUp = true;
            }

            listString[curIndex] += s.charAt(i);




        }

        String result = "";
        for(int i=0; i < listString.length; i++) {
            result+= listString[i];
        }

        return result;
    }
}
