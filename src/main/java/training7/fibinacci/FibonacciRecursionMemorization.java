package training7.fibinacci;

import java.util.HashMap;
import java.util.Map;

public class FibonacciRecursionMemorization {
    public static Map<Integer, Integer> map = new HashMap<>();
    public static int fibonacci(int n) {
        if (n < 2) return n;
        if(map.containsKey(n)) return map.get(n);
        int result = fibonacci(n-1) +fibonacci(n-2);
        map.put(n, result);
        return result;
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
