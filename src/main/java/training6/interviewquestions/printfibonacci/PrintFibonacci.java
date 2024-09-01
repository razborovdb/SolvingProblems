package training6.interviewquestions.printfibonacci;

public class PrintFibonacci {
    // 0 1 1 2 3 5 8 13 21 34 55
    public static void main(String[] args) {
        System.out.print("0 1 ");
        fibonacci(0,1,10);
    }


    public static void fibonacci(int prev, int cur, int num) {
        if (num < 2) return;
        int next = prev + cur;
        System.out.print(next + " ");
        fibonacci(cur, next, num-1);
    }
}
