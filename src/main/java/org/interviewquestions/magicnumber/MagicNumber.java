package org.interviewquestions.magicnumber;

public class MagicNumber {


    public static void main(String[] args) {
        System.out.println(isMagic(163));
    }

    public static boolean isMagic(int n) {
        int result = n;
        int newInt = 0;
        while (result > 0 || newInt > 9) {
            if (result == 0) {
                result = newInt;
                newInt = 0;
            }
            newInt += result % 10;
            result /= 10;
        }

        return newInt == 1;
    }
}
