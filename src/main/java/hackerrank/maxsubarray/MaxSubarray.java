package hackerrank.maxsubarray;

import java.util.List;

public class MaxSubarray {

    public static void main(String[] args) {
        long num1 = 199;
        long num2 = 189;
        long sum = num1 + num2;
        long modulo = 100;
        long l1 = sum % modulo;

        long sum2 = num1 % modulo + num2 % modulo;
        System.out.println(l1);
        System.out.println(sum2);
    }

    public static long maximumSum(List<Long> a, long m) {
        // Write your code here
        long res = 0;

        for (int i = 0; i < a.size(); i++) {
            long sum = 0;
            for (int j = i; j < a.size(); j++) {
                sum = (sum + a.get(j) % m) % m;

                if (sum > res) {
                    res = sum;
                }
            }
        }

        return res;

    }


}
