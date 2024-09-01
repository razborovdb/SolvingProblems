package leetcode.LengthOfLongestSubstring;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        // answer 3
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {

        Set<Character> usedChars = new HashSet<>();
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            usedChars = new HashSet<>();
            usedChars.add(s.charAt(i));
            int curLength = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (usedChars.contains(s.charAt(j))) {
                    break;
                }
                curLength++;
                usedChars.add(s.charAt(j));

            }
            if (curLength > result) {
                result = curLength;
            }

        }

        return result;

    }

}
