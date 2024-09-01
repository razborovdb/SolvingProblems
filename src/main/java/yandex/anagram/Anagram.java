package yandex.anagram;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class Anagram {
    public static void main(String[] args) throws IOException {
        String s1 = "abcdaaab";
        String s2 = "abcdaaaa";
        if (s1.length() != s2.length()) {
            System.out.println(0);
            return;
        }
        int result = 0;
        Map<Character, Integer> m = new HashMap<>();
        Map<Character, Integer> n = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char next = s1.charAt(i);
            if (m.containsKey(next)) {
                m.put(next, m.get(next)+1);

            } else {
                m.put(next,1);
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            char next = s2.charAt(i);
            if (n.containsKey(next)) {
                n.put(next, n.get(next)+1);

            } else {
                n.put(next,1);
            }
        }
        if (m.equals(n)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
