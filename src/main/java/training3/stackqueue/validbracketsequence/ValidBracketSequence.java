package training3.stackqueue.validbracketsequence;

import java.util.Stack;

public class ValidBracketSequence {

    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        int index = 0;
        boolean result = true;

        while (index < s.length() && result) {
            char next = s.charAt(index);
            index++;
            if(next == '{' || next == '(' || next == '[') {
                stack.push(next);
                continue;
            }
            if(next == '}' || next == ')' || next == ']') {
                if (stack.isEmpty()) {
                    result = false;
                    continue;
                }
                char prev = stack.pop();
                if(prev == '{' && next != '}' || prev == '[' && next != ']' || prev == '(' && next != ')') {
                    result = false;
                }
                continue;
            }

        }

        return result && stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(solution("({[{[()]}]})     ()"));

        System.out.println(solution("({[{[()}}]})"));
    }
}
