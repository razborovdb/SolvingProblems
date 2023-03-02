package org.sumprimenumbers;

public class SumPrimeNumbers {
    public static void main(String[] args) {
        checkSumPrime(18);
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num/2;i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean checkSumPrime(int num) {
        for (int i = 2; i < num/2; i++) {
            if (isPrime(i)) {
                if (isPrime(num-i)) {
                    System.out.println(i + " +  " + (num-i));
                }
            }
        }

        return true;
    }
}
