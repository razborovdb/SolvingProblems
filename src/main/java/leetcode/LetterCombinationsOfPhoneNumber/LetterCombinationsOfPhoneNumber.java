package leetcode.LetterCombinationsOfPhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {
    public static void main(String[] args) {
        // answer ["ad","ae","af","bd","be","bf","cd","ce","cf"]
        String digits = "23";
        //String digits = "2";
        List<String> result = letterCombinations(digits);
        for (String s: result) {
            System.out.print(s + ", ");
        }
        System.out.println();
    }


    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length() == 0) {
            return result;
        }

        int[] nums = new int[digits.length()];
        for (int i = 0; i< digits.length(); i++) {
            nums[i] = digits.charAt(i) - '0';
        }

        recursion(nums, 0, result, "");

        return result;
    }

    public static void recursion(int[] nums, int index, List<String> lS, String s) {
        if (index >= nums.length ) {

            lS.add(s);
            return;
        }
        switch(nums[index]) {
            case 2:
                for (char c = 'a'; c <= 'c'; c++) {
                    String newS = s + c;
                    recursion (nums,index + 1, lS, newS);

                }
                break;
            case 3:
                for (char c = 'd'; c <= 'f'; c++) {
                    String newS = s + c;
                    recursion (nums,index + 1, lS, newS);
                }
                break;
            case 4:
                for (char c = 'g'; c <= 'i'; c++) {
                    String newS = s + c;
                    recursion (nums,index + 1, lS, newS);
                }
                break;
            case 5:
                for (char c = 'j'; c <= 'l'; c++) {
                    String newS = s + c;
                    recursion (nums,index + 1, lS, newS);
                }
                break;
            case 6:
                for (char c = 'm'; c <= 'o'; c++) {
                    String newS = s + c;
                    recursion (nums,index + 1, lS, newS);
                }
                break;
            case 7:
                for (char c = 'p'; c <= 's'; c++) {
                    String newS = s + c;
                    recursion (nums,index + 1, lS, newS);
                }
                break;
            case 8:
                for (char c = 't'; c <= 'v'; c++) {
                    String newS = s + c;
                    recursion (nums,index + 1, lS, newS);
                }
                break;
            case 9:
                for (char c = 'w'; c <= 'z'; c++) {
                    String newS = s + c;
                    recursion (nums,index + 1, lS, newS);
                }
                break;
        }

    }


}
