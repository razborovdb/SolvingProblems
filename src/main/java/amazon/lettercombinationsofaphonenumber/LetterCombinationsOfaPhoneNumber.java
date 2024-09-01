package amazon.lettercombinationsofaphonenumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinationsOfaPhoneNumber {

    public static List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<>();
        List<List<Character>> letters = new ArrayList<>();
        letters.add(Arrays.asList('a','b','c'));
        letters.add(Arrays.asList('d','e','f'));
        letters.add(Arrays.asList('g','h','i'));
        letters.add(Arrays.asList('j','k','l'));
        letters.add(Arrays.asList('m','n','o'));
        letters.add(Arrays.asList('p','q','r', 's'));
        letters.add(Arrays.asList('t','u','v'));
        letters.add(Arrays.asList('w','x','y','z'));
        List<String> result = new ArrayList<>();
        combinations(digits, 0, new StringBuilder(), result,letters);
        return result;
    }
    public static void combinations(String digits, int start, StringBuilder current, List<String> result, List<List<Character>> letters) {
        if (start == digits.length()) {
            result.add(current.toString());
            return;
        }
        int digit = digits.charAt(start) - 48;
        List<Character> currentLetters = letters.get(digit-2);
        for (char c: currentLetters) {
            current.append(c);
            combinations(digits, start+1, current, result, letters);
            current.deleteCharAt(current.length()-1);
        }
    }

    public static void main(String[] args) {
        // ["ad","ae","af","bd","be","bf","cd","ce","cf"]
        String s = "23";
        List<String> result = letterCombinations(s);
        for (String cur : result) {
            System.out.print(cur + "; ");
        }

    }
}
