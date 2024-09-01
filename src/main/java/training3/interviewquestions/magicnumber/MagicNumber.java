package training3.interviewquestions.magicnumber;

public class MagicNumber {

    public static boolean isMagic(int num) {
        while (num > 9) {
            int sum = 0;
            while (num / 10 > 0) {
                sum += num % 10;
                num /= 10;
            }
            sum += num;
            num = sum;
        }
        return num == 1;

    }

    public static void main(String[] args) {
        System.out.println(isMagic(163));
    }
}
