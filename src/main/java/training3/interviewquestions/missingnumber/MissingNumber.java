package training3.interviewquestions.missingnumber;

public class MissingNumber {

    public static int missingNumbers(int[] a) {
        int sum = 0;
        for (int i: a) {
            sum += i;
        }
        return (a.length+1) * (a.length+2) / 2 - sum;
    }
    public static void main(String[] args) {
        int[] array = new int[] {1,4,5,6,7,8,10,9,2};

        System.out.println(missingNumbers(array));
    }


}
