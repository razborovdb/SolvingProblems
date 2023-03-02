package codesignal.d01162023.task4;

public class Task4 {

    int solution(int[] a, int k) {
        int low = 0;
        int high = 100000;

        while (low < high) {
            int middle = (low + high +1) / 2;
            int count = 0;
            for (int i: a) {
                count += i / middle;
            }
            if (count < k) {
                high = middle-1;
            } else {
                low = middle;
            }
        }
        return low;
    }

}
