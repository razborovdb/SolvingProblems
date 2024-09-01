package leetcode.ReverseInteger;

public class ReverseInteger {


    public static void main(String[] args) {
        // answer 321
        int x = 123;
        System.out.println(reverse(x));
    }
    public static int reverse(int x) {
        long val = x;
        if (val<0) {
            val = -val;
        }

        long lX = 0;
        long mult = 10;



        while (val / 10 > 0) {
            long cur = val % 10;

            lX = lX * mult + (val % 10);

            val /= 10;

        }
        lX = lX * mult + (val % 10);

        if (lX > Integer.MAX_VALUE || lX < Integer.MIN_VALUE) {
            return 0;
        }

        int result = (int) lX;
        if (x<0) {
            result = -result;
        }

        return result;

    }
}
