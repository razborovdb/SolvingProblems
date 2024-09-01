package org.stackqueue.validbracketsequence;

import java.util.Stack;

public class ValidBracketSequence {
    static boolean solution(String sequence) {
        if (sequence == null) return true;
        if (sequence.length() == 0) return true;
        Stack<Character> stack =  new Stack<Character>();
        for (int i = 0; i < sequence.length(); i++) {
            char c = sequence.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.size() == 0) return false;

                char r = stack.pop();
                if (c == ')' && r == '(' || c == ']' && r == '[' || c == '}' && r == '{') {
                    continue;
                }
                return false;
            }
        }



        return stack.size() == 0;
    }

    public static void main(String[] args) {
        System.out.println(solution("({[{[()]}]})"));

        System.out.println(solution("({[{[()}}]})"));
    }
}
