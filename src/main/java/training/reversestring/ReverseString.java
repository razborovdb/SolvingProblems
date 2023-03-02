package training.reversestring;

public class ReverseString {
    public static String reverseString(String s) {
        char[] rev = new char[s.length()];

        int i = 0;
        int j = s.length()-1;
        while (j >= i) {
            rev[i] = s.charAt(j);
            rev[j] = s.charAt(i);
            i++;
            j--;
        }
        return String.valueOf(rev);
    }
    public static void main(String[] args) {
        String string = "I am a programmer";
        System.out.println(reverseString(string));
    }
}
