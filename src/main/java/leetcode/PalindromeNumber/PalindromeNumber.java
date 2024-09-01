package leetcode.PalindromeNumber;

public class PalindromeNumber {
    public static void main(String[] args) {
        // answer true
        int x =423324;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }
        String s = Integer.toString(x);

        for (int i = 0; i < s.length()/2;i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

}
