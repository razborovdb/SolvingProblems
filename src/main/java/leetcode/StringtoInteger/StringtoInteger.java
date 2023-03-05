package leetcode.StringtoInteger;

public class StringtoInteger {
    public static void main(String[] args) {
        //answer -421
        String s = "    -421";
        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String s) {
        if (s.equals("")) {
            return 0;
        }
        boolean isNegative = false;
        int index = 0;
        long result = 0;

        while(index < s.length() && s.charAt(index) == ' ') {
            index++;
        }

        if (index < s.length()) {

            if (s.charAt(index) == '-') {
                isNegative = true;
                index ++;
            } else if (s.charAt(index) == '+') {
                index++;
            }

            while (index < s.length() && s.charAt(index) >= '0' && s.charAt(index) <= '9') {
                result = result * 10 + (int) (s.charAt(index)-'0');
                index++;

                if (result > Integer.MAX_VALUE) {
                    break;
                }
                if (result < Integer.MIN_VALUE) {
                    break;
                }


            }

            if(isNegative) {
                result = -result;
            }

            if (result > Integer.MAX_VALUE) {
                result = Integer.MAX_VALUE;
            }
            if (result < Integer.MIN_VALUE) {
                result = Integer.MIN_VALUE;
            }
        }


        return (int) result;

    }

}
