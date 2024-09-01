package codesignal.d01172023.task4;

public class Task4 {
    static long solution(int[] arr) {
        long result = 0;

        for (int i = 0; i < arr.length-1; i++) {
            //for (int j = i+1; j < arr.length; j++) {
//                System.out.println("i= " + i + "; j = " + j);
                long cur = check(arr, i, arr.length-1);
                System.out.println("--------------------");
                result += cur;

            //}
        }

        return result;
    }


    static long check(int[] arr, int start, int end) {
        long result = 0;
        int i = start;
        boolean curStatus;
        if (arr[start] == arr[start+1]) return result;
        result++;
        if (arr[start] > arr[start+1]) {
            curStatus = true;
        } else {
            curStatus = false;
        }
        System.out.println("i = " + arr[start] + "; i+1 = " + arr[start+1]);
        i++;
        while (i < end) {
            System.out.println("i = " + arr[start] + "; " + arr[start+1]);
            if (arr[i] == arr[i+1]) {
                break;
            }
            if (arr[i] > arr[i+1] && !curStatus) {
                curStatus = true;
                result++;
                i++;
                continue;
            }
            if (arr[i] < arr[i+1] && curStatus) {
                curStatus = false;
                result++;
                i++;
                continue;
            }
            break;

        }

        return result;
    }

    public static void main(String[] args) {
        // 4
        int[] a = new int[] {9, 8, 7, 6, 5};
        long startTime = System.currentTimeMillis();
        long result = solution(a);
        long endTime = System.currentTimeMillis();
        System.out.println("time = " + (endTime - startTime));
        System.out.println("result = " + result);
        System.out.println("----------------------------------------");
        // 10
        a = new int[] {1, 2, 1, 2, 1};
        startTime = System.currentTimeMillis();
        result = solution(a);
        endTime = System.currentTimeMillis();
        System.out.println("time = " + (endTime - startTime));
        System.out.println("result = " + result);
        System.out.println("----------------------------------------");
        // 0
        a = new int[] {10, 10, 10};
        startTime = System.currentTimeMillis();
        result = solution(a);
        endTime = System.currentTimeMillis();
        System.out.println("time = " + (endTime - startTime));
        System.out.println("result = " + result);
    }
}
