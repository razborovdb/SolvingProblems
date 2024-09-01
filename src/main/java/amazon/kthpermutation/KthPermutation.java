package amazon.kthpermutation;

import java.util.ArrayList;
import java.util.List;

public class KthPermutation {
    public static int factorial(int n) {
        if(n < 2) return 1;
        return n * factorial(n - 1);
    }
    static void find_kth_permutation(List<Character> v, int k, StringBuilder result) {
        int fact = factorial(v.size() - 1);
        k = k - 1;
        while(!v.isEmpty()) {
            int symbol = k / fact;
            result.append(v.get(symbol));
            v.remove(symbol);
            k = k % fact;
            if (!v.isEmpty()) {
                fact = fact / v.size();
            }
        }
    }
    public static void main(String[] args) {
        //for (int i = 1; i <= factorial(4); ++i) {
        //    System.out.println( i + "th permutation = \t" + get_permutation(4, i));
        //}


        // 3 4 1 2
        StringBuilder sb = new StringBuilder();
        List<Character> v = new ArrayList<>();
        v.add('1');
        v.add('2');
        v.add('3');
        v.add('4');
        find_kth_permutation(v, 17, sb);
        System.out.println( "17th permutation = \t" + sb.toString());
    }
}
