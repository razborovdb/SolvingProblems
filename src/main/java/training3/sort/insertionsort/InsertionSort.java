package training3.sort.insertionsort;

public class InsertionSort {
    public static void solution(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = i;

            while(j > 0 && a[j-1] > a[j]) {
                int temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = new int[] {81, 82, 5, 21, 46, 74, 73, 97, 53, 23};
        solution(a);
        print(a);
    }

    static void print(int[] a) {
        for (int i: a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
