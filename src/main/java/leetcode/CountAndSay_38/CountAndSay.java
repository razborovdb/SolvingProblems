package leetcode.CountAndSay_38;

public class CountAndSay {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countAndSay(n));
        
    }


    public static String countAndSay(int n) {
        if(n == 1) return "1";
        String s = countAndSay(n-1);
        String result = "";
        while(s.length() > 0) {
            char c = s.charAt(0);
            int count = 1;
            while(s.length() > count && s.charAt(count) == c ) {
                count++;
            }
            result = result + Integer.toString(count) + c;
            s = s.substring(count);
        }
        return result;
    }
}
