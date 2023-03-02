package codesignal.d01102023.task2;

public class Task2 {
    public static void main(String[] args) {




        int[] nums = new int[] {1,4,5,6,3};
        // false
        System.out.println(solution(nums));
        //
        nums = new int[] {-97, -51, -8, 25, 44, 70, 98, 77, 68, 31, -5, -36, -80};
        // true
        System.out.println(solution(nums));
    }


    public static boolean solution(int[] a) {
        int[] b = new int[a.length];
        int index1 = 0;
        int index2 = a.length-1;
        int prev = a[0];
        index1++;
        int swIndex = 1;
        for (int i = 1; i < b.length; i++) {
            if (swIndex == 0) {
                swIndex = 1;
                if (prev >= a[index1]) return false;
                prev = a[index1];
                index1++;

            } else {
                swIndex = 0;
                if (prev >= a[index2]) return false;
                prev = a[index2];
                index2--;

            }
        }


        return true;
    }
}
