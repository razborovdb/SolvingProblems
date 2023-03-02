package training2.interviewquestions.printfibonacci;

public class PrintFibonacci {
    // 0 1 1 2 3 5 8 13 21 34
    public static void fibonacci(int n1, int n2, int count) {
        if (count <= 2) return;
        int newN = n1 + n2;
        System.out.print(newN + " ");
        fibonacci(n2, newN, count - 1);

    }

    public static void main(String[] args) {
        System.out.print("0 1 ");
        fibonacci(0,1,10);
    }
}
