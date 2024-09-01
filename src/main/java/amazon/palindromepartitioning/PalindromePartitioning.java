package amazon.palindromepartitioning;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        findPartitioning(s, 0, new ArrayList<String>(), result);
        return result;
    }

    public static void findPartitioning(String s, int start, List<String> current, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
        }
        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s,start,i)) {
                current.add(s.substring(start, i+1));
                findPartitioning(s, i+1, current, result);
                current.remove(current.size()-1);
            }
        }

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

    public static void main(String[] args) {
        // [["a","a","b"],["aa","b"]]
        String s = "aab";
        List<List<String>> result = partition(s);
        for (List<String> list: result) {
            for (String cur : list) {
                System.out.print(cur + "; ");
            }
            System.out.println();
        }
    }

}
