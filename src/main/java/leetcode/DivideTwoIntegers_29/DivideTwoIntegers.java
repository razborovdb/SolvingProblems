package leetcode.DivideTwoIntegers_29;

public class DivideTwoIntegers {

    public static int divide(int dividend, int divisor) {
        long val = Math.abs((long) dividend);
        long div = Math.abs((long) divisor);
        long result = 0;
        boolean sign = true;
        if ( (dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0) ) {
            sign = false;
        }
        long quotient = 0;
        long temp = 0;
        for (int i = 31; i>= 0; --i) {
            if (temp + (div << i) <= val) {
                temp += div << i;
                quotient |= 1L << i;
            }
        }
        if (sign) {
            quotient = -quotient;
        }
        if (quotient >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int) quotient;
    }
}
