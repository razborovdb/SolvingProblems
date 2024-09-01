package training3.reversestring;

public class ReverseString {
    public static String reverseString(String s) {
        char[] r = new char[s.length()];

        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            r[j] = s.charAt(i);
            r[i] = s.charAt(j);
            i++;
            j--;
        }
        return String.valueOf(r);
    }
    public static void main(String[] args) {
        String string = "I am a programmer";
        System.out.println(reverseString(string));
    }
}
