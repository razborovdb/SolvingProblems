package leetcode.PalindromePartitioning_131;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PalindromePartitioning {

    public static void main(String[] args) {
        // 4
        String s = "aab"; // Output: [["a","a","b"],["aa","b"]]
        long startTime = System.currentTimeMillis();
        List<List<String>> result = partition(s);
        long endTime = System.currentTimeMillis();
        System.out.println("time = " + (endTime - startTime));
        for (int i = 0; i < result.size(); i++)
        {
            for (int j = 0; j < result.get(i).size(); j++)
            {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        }


    }

    public static List<List<String>> partition(String s) {
        List<List<String>> lists = new ArrayList<>();
        Deque<String> curList = new LinkedList<>();
        solution(lists, curList, 0, s.length(),s);


        return lists;
    }

    public static void solution(List<List<String>> lists, Deque<String> curList, int start, int end, String s) {
        if (start >= end) {
            lists.add(new ArrayList<>(curList));
            return;
        }


        for (int i = start; i < end; i++) {
            if (isPalindrome(s, start,i)) {
                curList.addLast(s.substring(start, i+1));
                solution(lists, curList, i+1, end, s);
                curList.removeLast();
            }
        }
    }


    public static boolean isPalindrome (String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
