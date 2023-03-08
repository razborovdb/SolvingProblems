package leetcode.LongestCommonPrefix;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        //answer fl
        String[] strs = new String[] {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        String result = "";
        String prefix = strs[0];
        int minLength = strs[0].length();
        for (int i = 1; i < strs.length;i++) {
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }

        if (minLength == 0) {
            return "";
        }

        for (int i = 0; i < minLength; i++) {
            boolean isEqual = true;
            char c = strs[0].charAt(i);
            for (int j=1; j < strs.length;j++) {
                if (c != strs[j].charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
            if (!isEqual) {
                break;
            }
            result = result + c;
        }

        return result;
    }
}
