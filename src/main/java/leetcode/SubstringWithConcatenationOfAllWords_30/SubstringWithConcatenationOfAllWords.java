package leetcode.SubstringWithConcatenationOfAllWords_30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringWithConcatenationOfAllWords {
    public static void main(String[] args) {
        String s = "wordgoodgoodgoodbestword";
        String[] words = new String[] {"word","good","best","good"};
        List<Integer> list = findSubstring(s, words);


        list.forEach(str -> {
            System.out.print(str + "; ");
        });
    }


    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        int len = words[0].length();
        int allLen = words.length * len;
        Map<String, Integer> map = new HashMap<>();

        for (String ss: words) {
            if (map.containsKey(ss)) {
                map.put(ss, map.get(ss)+1);
            } else {
                map.put(ss,1);
            }
        }

        for (int i = 0; i < s.length() - allLen + 1; i++) {
            String subS = s.substring(i, i+allLen);
            Map<String, Integer> curMap = new HashMap<>();
            while (subS.length() >= len) {
                String key = subS.substring(0, len);

                if (curMap.containsKey(key)) {
                    curMap.put(key, curMap.get(key)+1);
                } else {
                    curMap.put(key,1);
                }
                subS = subS.substring(0+len);
            }
            if (curMap.equals(map)) {
                result.add(i);
            }

        }

        return result;
    }
}
