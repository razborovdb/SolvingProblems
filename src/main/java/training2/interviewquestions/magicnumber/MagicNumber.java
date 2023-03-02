package training2.interviewquestions.magicnumber;

public class MagicNumber {
    public static boolean isMagic(int n) {
        int sum = n;

        while (sum > 9) {
            int newSum = sum;
            sum = 0;
            while (newSum > 0) {
                sum += newSum % 10;
                newSum /= 10;
            }

        }

        return sum == 1;
    }

    // 163 -true
    public static void main(String[] args) {
        System.out.println(isMagic(163));
    }
}
