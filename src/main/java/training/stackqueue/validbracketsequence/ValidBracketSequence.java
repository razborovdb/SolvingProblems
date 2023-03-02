package training.stackqueue.validbracketsequence;

import java.util.Stack;

public class ValidBracketSequence {
    public static void main(String[] args) {
        System.out.println(solution("({[{[()]}]})     ()"));

        System.out.println(solution("({[{[()}}]})"));
    }

    public static boolean solution(String seq) {
        int i = 0;
        Stack<Character> stack = new Stack<>();

        while (i < seq.length()) {
            char nextChar = seq.charAt(i);
            if (nextChar == '(' || nextChar == '{' || nextChar == '[') {
                stack.push(nextChar);
            }
            if (nextChar == ')' || nextChar == '}' || nextChar == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    int prevChar = stack.pop();
                    if (nextChar == '}' && prevChar != '{' || nextChar == ']' && prevChar != '['
                            || nextChar == ')' && prevChar != '(') {
                        return false;
                    }
                }
            }
            i++;

        }

        return stack.isEmpty();


    }
}
