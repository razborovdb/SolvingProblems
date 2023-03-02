package org.reversestring;

public class ReverseString {
    public static void main(String[] args) {
        String string = "I am a programmer";
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        char[] result = new char[string.length()];
        int i = 0;
        int j = string.length()-1;
        while(j >= i) {
            result[j] = string.charAt(i);
            result[i] = string.charAt(j);
            j--;
            i++;
        }

        return String.valueOf(result);
    }
}
