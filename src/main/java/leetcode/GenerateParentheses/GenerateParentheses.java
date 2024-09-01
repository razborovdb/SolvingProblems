package leetcode.GenerateParentheses;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        // answer "((()))","(()())","(())()","()(())","()()()"
        int n = 3;
        generateParenthesis(n).forEach(System.out::println);
    }
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        String s = "";
        gen(n, n, s, result);

        return result;

    }

    public static void gen(int open, int close, String s, List<String> result) {
        if (open == 0 && close == 0) {
            result.add(s);
        }


        if (open > 0) {
            gen(open - 1, close, s + "(", result);
        }

        if (open < close) {
            gen(open, close-1, s + ")", result);
        }
        return;
    }
}
