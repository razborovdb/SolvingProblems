package org.recursion.factorial;

public class Factorial {
    static int solution(int x) {
        if (x <= 1) return 1;
        return x * solution(x-1);
    }

    public static void main(String[] args) {
        //120
        System.out.println(solution(5));
    }
}
