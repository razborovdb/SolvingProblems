package training.interviewquestions.magicnumber;

public class MagicNumber {
    public static void main(String[] args) {
        System.out.println(isMagic(163));
    }

    public static boolean isMagic(int n) {
        int cur = n;
        int sum = 0;

        while (cur > 0 || sum > 9) {
            if (cur == 0) {
                cur = sum;
                sum = 0;
            }
            sum += cur % 10;
            cur /= 10;
        }


        return sum == 1;
    }
}
