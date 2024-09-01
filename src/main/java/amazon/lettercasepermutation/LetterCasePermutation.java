package amazon.lettercasepermutation;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

    public static List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        permutation(new StringBuilder(s), 0, result);
        return result;
    }
    public static void permutation(StringBuilder sb, int i, List<String> result) {
        if (i == sb.length() ) {
            result.add(sb.toString());
            return;
        }
        if (Character.isDigit(sb.charAt(i))) {
            permutation(sb, i+1, result);
            return;
        }
        sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
        permutation(sb, i + 1, result);
        sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
        permutation(sb, i + 1, result);
    }

    public static void main(String[] args) {
        String s = "a1b2";
        List<String> list = letterCasePermutation(s);

        for (String str: list) {
            System.out.println(str);
        }
    }


}
