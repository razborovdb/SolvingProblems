package hackerrank.javastack;

import java.util.Stack;

public class JavaStack {
    public static void main(String []argh)
    {
        String input="{}[]()";
            //Complete the code
        System.out.println(checkString(input));
        input="{{}[]()}";
        //Complete the code
        System.out.println(checkString(input));
        input="{}[](){";
        //Complete the code
        System.out.println(checkString(input));
    }

    public static boolean checkString(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.isEmpty()) {
            return true;
        }
        int index = 0;
        while (index < s.length()) {
            char nextC = s.charAt(index);
            index++;
            if (nextC == '[' || nextC == '(' || nextC == '{') {
                stack.push(nextC);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char prevC = stack.pop();
                if (nextC == ']' && prevC != '[' || nextC == '}' && prevC != '{'
                        || nextC == ')' && prevC != '(') {
                    return false;
                }
            }

        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
