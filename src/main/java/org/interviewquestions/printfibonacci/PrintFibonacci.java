package org.interviewquestions.printfibonacci;

public class PrintFibonacci {
    public static void fibonacci(int val1, int val2, int n) {
        if (n == 0) return;

        System.out.print(" " + (val1 + val2));

        fibonacci(val2, val1+val2, --n);
        return;
    }
    // 0 1 1 2 3 5 8 13 21 34 55
    public static void main(String[] args) {
        System.out.print("0 1");
        fibonacci(0,1,10);
    }
}
