package amazon.longestpalindromicsubstring;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        // 6
        String s = "asffdffsa";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        int l = s.length();
        if(l < 2) return s;
        int start = 0;
        int end = 0;
        for(int i=0; i < l; i++) {
            int low = i-1;
            int hi = i;
            while(low >= 0 && hi < l && s.charAt(low) == s.charAt(hi)) {
                if(hi - low + 1 > end - start + 1) {
                    start = low;
                    end = hi;
                }
                low--;
                hi++;
            }
            low = i-1;
            hi = i+1;
            while(low >= 0 && hi < l && s.charAt(low) == s.charAt(hi)) {
                if(hi - low + 1 > end - start + 1) {
                    start = low;
                    end = hi;
                }
                low--;
                hi++;
            }
        }
        return s.substring(start,end+1);
    }
}
