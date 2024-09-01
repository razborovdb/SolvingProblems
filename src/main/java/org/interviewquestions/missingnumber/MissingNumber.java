package org.interviewquestions.missingnumber;

public class MissingNumber {

    public static void main(String[] args) {
        int[] array = new int[] {3,4,5,6,7,8,1,9,2};

        System.out.println(missingNumbers(array));
    }

    public static int missingNumbers(int[] array) {
        int n = array.length + 1;

        int sum = n * (n+1) / 2;

        int sum2 = 0;
        for (int i: array) {
            sum2 += i;
        }

        return sum - sum2;
    }
}
