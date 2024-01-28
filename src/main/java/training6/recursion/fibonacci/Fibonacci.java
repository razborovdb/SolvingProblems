package training6.recursion.fibonacci;

public class Fibonacci {

    public static int solution(int n) {
        if(n < 2) return n;

        return solution(n-1) + solution(n-2);
    }

    public static void main(String[] args) {
        //21
        System.out.println(solution(8));
    }
}
