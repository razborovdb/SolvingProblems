package training6.interviewquestions.second;

public class Second {

    public static int solution2(int[] a) {
        int result = 0;

        int i = 0;
        int sum = 0;
        int sum2 = 0;
        int numZero = 0;
        while(i < a.length) {
            if(a[i] != 0) {
                if(numZero == 0) {
                    sum++;
                } else {
                    sum2++;
                }
            } else {
                numZero++;
                if(numZero == 2) {
                    if(result < (sum + sum2)) {
                        result = sum + sum2;
                    }
                    if(sum2 == 0) {
                        numZero = 0;
                        sum = 0;
                    } else {
                        numZero = 1;
                        sum = sum2;
                        sum2 = 0;
                    }
                }
            }
            i++;
        }

        if(result < (sum + sum2)) {
            result = sum + sum2;
        }

        return result;
    }

    public static void main(String[] args) {
        // int[] {0, 1, 1, 1, 0, 1, 1, 0}
        // 0, 1, 1, 1, 0, 0 , 1,1 , 0, 1,1,1,1

        int[] a = new int[] {0, 1, 1, 1, 0, 1, 1, 0};
        System.out.println(solution2(a));

        a = new int[] {0, 1, 1, 1, 0, 0 , 1, 1, 0, 1,1,1,1, 0, 1,1,1,1};
        System.out.println(solution2(a));


    }
}
