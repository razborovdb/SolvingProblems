package jpmorgan.interview2;

public class Task1 {
    public static void main(String[] args) {
        String s = "zdaaabbaaadh";
        System.out.println(solution(s));
        long startTime = System.currentTimeMillis();
    }

    public static String solution(String s) {
        int start = 0;
        int end = s.length()-1;
        StringBuilder sb = new StringBuilder(s);

        while(start < end) {
            char startChar = sb.charAt(start);
            char endChar = sb.charAt(end);
            if (startChar != endChar) {
                if (startChar < endChar) {
                    sb.setCharAt(end, startChar);
                } else {
                    sb.setCharAt(start, endChar);
                }

                if (isPalindrome(sb.toString(), start, end)) {
                    return sb.toString();
                } else {
                    return "IMPOSSIBLE";
                }
            }
            start++;
            end--;
        }
        if (start == end) {
            if (sb.charAt(start) > 'a') {
                sb.setCharAt(start, 'a');
                return sb.toString();
            }
        }
        return "IMPOSSIBLE";
    }

    public static boolean isPalindrome(String s, int start, int end) {
        while(start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
