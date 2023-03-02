package training.sumprimenumbers;

public class SumPrimeNumbers {
    public static void main(String[] args) {
        checkSumPrime(18);

    }

    public static void  checkSumPrime(int num) {
        for (int i = 1; i <= num /2; i++) {
            if (isPrimeNumber(i)) {
                //System.out.println(i + "; " + (num - i));
                if (isPrimeNumber(num - i)) {
                    System.out.println(i + "; " + (num - i));
                }
            }
        }


    }

    public static boolean isPrimeNumber(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
