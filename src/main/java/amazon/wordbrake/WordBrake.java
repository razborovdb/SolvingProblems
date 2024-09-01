package amazon.wordbrake;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBrake {
    public static boolean wordBreak(String s, List<String> wordDict) {

        boolean[] table = new boolean[s.length()];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j <= i; j++) {
                if(j == 0 || table[j-1]) {
                    if(wordDict.contains(s.substring(j,i+1))) {
                        table[i] = true;
                        break;
                    }
                }
            }

        }
        return table[table.length-1];
    }




    public static void main(String[] args) {
        // 6
        String s = "a";
        List<String> dict = new ArrayList<>();
        dict.add("a");
        System.out.println(wordBreak(s, dict));
    }
}
