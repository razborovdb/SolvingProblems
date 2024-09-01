package training6.interviewquestions.magicnumber;

public class MagicNumber {

    public static boolean isMagic(int n) {

        while (n > 9) {
            int sum = 0;
            while(n / 10 > 0) {
                sum += n % 10;
                n /= 10;
            }
            sum += n % 10;
            n = sum;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isMagic(163));
    }
}
