package training6.interviewquestions.missingnumber;

public class MissingNumber {
    public static int missingNumbers(int[] array) {
        int sum = 0;
        for (int i: array) {
            sum += i;
        }

        return (array.length + 1) * (array.length + 2) / 2 - sum;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1,4,5,6,7,8,10,9,2};

        System.out.println(missingNumbers(array));
    }
}
