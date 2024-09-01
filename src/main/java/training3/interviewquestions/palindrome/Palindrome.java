package training3.interviewquestions.palindrome;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        return compare(s, 0, s.length()-1);
    }


    public static boolean compare(String s, int start, int end) {
        if (start >= end) return true;
        if(s.charAt(start) != s.charAt(end)) return false;

        return compare(s, start+1, end-1);
    }
    public static void main(String[] args) {
        boolean result = isPalindrome("ccabdabacc");
        System.out.println(result);
    }
}
