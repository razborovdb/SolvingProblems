package codesignal.d01122023.task3;

public class Task3 {
    public static void main(String[] args) {
        long i1 = 123;
        long i2 = i1;

        int count = 5;

        while (count > 0) {
            i2 = (i2 << 1) + (i2 << 3);
            count--;
        }


        System.out.println(i2);
    }
}
