package codesignal.d01102023.task1;

public class Task1 {
    public static void main(String[] args) {
        int[] nums = new int[] {4,0,1,-2, 3};
        // solution(a) = [4, 5, -1, 2, 1]
        print(solution(nums));
    }

    public static int[] solution(int[] a) {
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
            if (i-1 >= 0) {
                b[i] += a[i-1];
            }
            if (i+1 < a.length) {
                b[i] += a[i+1];
            }
        }
        return b;
    }

    public static void print(int[] nums) {
        for (int i: nums) {
            System.out.print(i + "; ");
        }
        System.out.println();
    }
}
