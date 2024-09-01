package amazon.generateparentheses;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        createParenthesis(n, 0, 0, "", result);
        return result;
    }

    public static void createParenthesis(int n, int left, int right, String current, List<String> result) {
        if (left >= n && right >= n) {
            result.add(current);
            return;
        }
        if (left < n) {
            current += "(";
            createParenthesis(n, left+1, right, current, result);
            current = current.substring(0, current.length()-1);
        }
        if (right < n && right < left) {
            current += ")";
            createParenthesis(n, left, right+1, current, result);
            current = current.substring(0, current.length()-1);
        }
    }

    public static void main(String[] args) {
        // ["((()))","(()())","(())()","()(())","()()()"]
        List<String> result = generateParenthesis(3);
        for (String s: result) {
            System.out.println(s);
        }
    }
}
