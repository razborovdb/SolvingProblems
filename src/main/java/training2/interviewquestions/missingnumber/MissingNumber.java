package training2.interviewquestions.missingnumber;

public class MissingNumber {

    public static int missingNumbers(int[] nums) {
        int sum = 0;
        for (int i: nums) {
            sum += i;
        }
        return (nums.length + 1) * (nums.length + 2) / 2 - sum;

    }

    public static void main(String[] args) {
        int[] array = new int[] {3,4,5,6,7,8,10,1,2};

        System.out.println(missingNumbers(array));
    }
}
