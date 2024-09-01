package leetcode.ValidParentheses;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        // answer true
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']' ){
                if (stack.isEmpty()) {
                    return false;
                }
                char from = stack.pop();
                if ( (from != '(' && c == ')') || (from != '[' && c == ']') || (from != '{' && c == '}') ) {
                    return false;
                }

            }
            i++;
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
