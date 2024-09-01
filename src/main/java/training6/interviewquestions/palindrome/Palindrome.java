package training6.interviewquestions.palindrome;

public class Palindrome {
    public static boolean isPalindrome(String s1) {
        int start = 0;
        int end = s1.length() - 1;

        while (start < end) {
            if (s1.charAt(start) != s1.charAt(end)) return false;

            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("ccababacc"));
    }
}
