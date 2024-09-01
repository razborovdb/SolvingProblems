package training3.sumprimenumbers;

public class SumPrimeNumbers {
    public static void main(String[] args) {
       checkSumPrime(46);

    }

    public static boolean checkSumPrime(int number) {
        for(int i = 1; i <= number / 2; i++) {
            if (isPrime(i)) {
                if (isPrime(number-i)) {
                    System.out.println(i + "; " + (number - i));
                }
            }
        }
        return false;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
