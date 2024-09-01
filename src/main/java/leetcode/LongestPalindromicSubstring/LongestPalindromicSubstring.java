package leetcode.LongestPalindromicSubstring;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        //answer bab
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        String result = "";
        for (int i=0; i < s.length(); i++ ) {
            for (int j=i; j<s.length(); j++) {
                String curStr = s.substring(i,j+1);
                if (isPalindrome(curStr)) {
                    if (curStr.length() > result.length()) {
                        result = curStr;
                        if (result.length() == s.length()) {
                            return result;
                        }
                    }
                }
            }
        }


        return result;
    }
    public static boolean isPalindrome(String s) {

        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                return false;
            }
        }

        return true;
    }
}
