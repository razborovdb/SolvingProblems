package training6.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class FibonacciRecursionMemorization {
    public static Map<Integer, Integer> memory = new HashMap<>();
    public static int fibonacci(int n) {
        if (n < 2) return n;
        if(memory.containsKey(n)) return memory.get(n);


        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {

        System.out.println(fibonacci(0)); //0
        System.out.println(fibonacci(1)); //1
        System.out.println(fibonacci(2)); //1
        System.out.println(fibonacci(3)); //2
        System.out.println(fibonacci(8)); //21
        System.out.println(fibonacci(17)); //1597
        System.out.println(fibonacci(38)); //39088169
    }
}
