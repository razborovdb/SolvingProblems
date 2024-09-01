package leetcode.LongestValidParentheses_32;

import java.util.Stack;

public class LongestValidParentheses {

    public static void main(String[] args) {
        String s = "())()()(())((()(()()(((()))((((())((()(())()())(()((" +
                "((()))()(()))(())()(())(()(((((())((((((()())())(()(()((())()))(" +
                "()))))))()(()))((((())()()()))()()()(((()(()())(()()(()(()()(((()))))" +
                "))()()))())())((()()))))))((()))(((()((())()(()()))((())))()()())))))))()))))(()))))()))()))()((())))" +
                "((()))(()))))))(((()))))))))()(()()()(())((())()))()()(())))()()))(()())()))(((()())()))((())((((()))(" +
                "()(()(()()()(((())()(((((()))((()(((((())(()()))((((((((()(()(()(()(())))(())(()())())(()((((()(()" +
                ")((()(())))(())))()(((((()(()()(())))))))())(())(())(()()(((())))((()))(((((()))))())))()((()))()))))" +
                "())))))((())(((((()()))((((())))(((()(()(())())(((()(()(()()()())))())()))((()((())())()()()(((())(((" +
                "((()((((((()((()())))((((())((()(((((((()(()((()()()(()(()())(()(()()((((())))()(((()())))(()()))()((" +
                ")()()()(((((())(()))))((()))())))()((((((()))())))()(()))(())))((((()())(((((()()())(((((())(()())((" +
                ")))))()(()()))()))))))())))(((())(()(()()))(()))()(((())))())((((()(((()))))))()(()(()))()()(()()))))" +
                "))))((()))))))(())((()((()))()))((((((()())))))(()((())((((()))))(()(()()()()(()))()()(()(()))(()()(((" +
                "((((()())(())(()())((())())()(()())((())()())())(()())))())))(())())())(())((()())(((()()))()))()()))(" +
                ")(()(())((((((((())))()((())((()((((((((((()))))(()(((((())(()(()())())))((())())))))()))(()((()()))((" +
                "()((())()()()((()(())())((())())(()()(((())))))())()()(()))()())(()(()((())))((((()()(())))())(())(()(" +
                "()(())())())(()()())()(())())))(()()(((())))((()()(((())()()(()())((((()()(()())(()((((()(()()(()(()((" +
                "(()((()())(()()))(()((((()(((((()))))()()))(((()((((((()(()()()()())()))(()(())))))((()(((()())())))" +
                "(((()()))(()(()(((((((()()))(()(())))())()(())())(())(()))(())(()))()()(()()())))))()))()((())(((()(" +
                "(((((((())()()))())))((()())(";
        long start = System.currentTimeMillis();
        int result = longestValidParentheses(s);
        long stop = System.currentTimeMillis();
        System.out.println(result);
        System.out.println((stop-start));
    }
    public static int longestValidParentheses(String s) {
        int n = s.length();

        // Create a stack and push -1
        // as initial index to it.
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);

        // Initialize result
        int result = 0;

        // Traverse all characters of given string
        for (int i = 0; i < n; i++)
        {
            // If opening bracket, push index of it
            if (s.charAt(i) == '(')
                stk.push(i);

                // // If closing bracket, i.e.,str[i] = ')'
            else
            {
                // Pop the previous
                // opening bracket's index
                if(!stk.empty())
                    stk.pop();

                // Check if this length
                // formed with base of
                // current valid substring
                // is more than max
                // so far
                if (!stk.empty())
                    result
                            = Math.max(result,
                            i - stk.peek());

                    // If stack is empty. push
                    // current index as base
                    // for next valid substring (if any)
                else
                    stk.push(i);
            }
        }

        return result;
    }

    static boolean isValid(StringBuilder s) {

        Stack<Character> stack = new Stack<>();
        int index = 1;
        if (s.charAt(0) == ')') {
            return false;
        }
        stack.push(s.charAt(0));

        while (index < s.length()) {
            char c  = s.charAt(index);

            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char ch = stack.pop();
                if (ch != '(') {
                    return false;
                }
            }
            index++;
        }
        return stack.isEmpty();
    }
}
