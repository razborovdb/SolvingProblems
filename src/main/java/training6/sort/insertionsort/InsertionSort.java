package training6.sort.insertionsort;

public class InsertionSort {

    public static void solution(int[] a) {
        for (int i=0; i < a.length - 1;i++) {
            for (int j = i+1; j > 0; j--) {
                if(a[j-1] > a[j]) {
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
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
