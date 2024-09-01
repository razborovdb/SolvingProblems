package training6.recursion.factorial;

public class Factorial {

    public static int solution(int n) {
        if (n <= 1) return 1;
        return n * solution(n-1);
    }

    public static void main(String[] args) {
        //720
        System.out.println(solution(6));


    }
}
