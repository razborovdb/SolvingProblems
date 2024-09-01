package org.interviewquestions.palindrome;

public class Palindrome {

    public static boolean isPalindrome(String s) {
        String reverse = getReverseWord(s);
        System.out.println(reverse);
        return s.equals(reverse);

    }

    static String getReverseWord(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        return s.charAt(s.length()-1) + getReverseWord(s.substring(0,s.length()-1));
    }

    public static void main(String[] args) {
        boolean result = isPalindrome("cabdbac");
        System.out.println(result);
    }
}
