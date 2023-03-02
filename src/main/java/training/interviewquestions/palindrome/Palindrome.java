package training.interviewquestions.palindrome;

public class Palindrome {
    public static void main(String[] args) {
        boolean result = isPalindrome("ccabdbacc");
        System.out.println(result);
    }

    private static boolean isPalindrome(String s1) {
        return compare(s1, 0, s1.length()-1);
    }

    public static boolean compare(String s1, int start, int end) {
        if (end < start) return true;
        if (s1.charAt(start) != s1.charAt(end)) return false;

        return compare(s1,start+1, end-1);
    }
}
