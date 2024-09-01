package leetcode.MultiplyStrings_43;

public class MultiplyStrings {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        System.out.println(multiply(num1, num2));
    }
    public static String multiply(String num1, String num2) {
        String result = "";
        String startPosition = "";
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        for (int i = num1.length() - 1; i >= 0; i--) {
            String s = startPosition;
            int next = Integer.parseInt(String.valueOf(num1.charAt(i)));
            int move = 0;
            for(int j = num2.length() - 1; j >= 0; j--) {
                int next2 = Integer.parseInt(String.valueOf(num2.charAt(j)));
                int prod = next * next2 + move;
                move = prod / 10;
                s = Integer.toString(prod % 10) + s;
            }
            System.out.println("s = " + s);
            if (move != 0) {
                s = Integer.toString(move) + s;
            }
            result = addString(result, s);
            startPosition = startPosition + "0";
        }
        return result;
    }

    public static String addString(String s1, String s2) {
        String result = "";
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int move = 0;

        while(i >= 0 && j >= 0) {
            int next = Integer.parseInt(String.valueOf(s1.charAt(i)));
            int next2 = Integer.parseInt(String.valueOf(s2.charAt(j)));
            int sum = next + next2 + move;
            move = sum / 10;
            result = Integer.toString(sum % 10) + result;
            i--;
            j--;
        }

        while(i >= 0) {
            int next = Integer.parseInt(String.valueOf(s1.charAt(i)));
            int sum = next + move;
            move = sum / 10;
            result = Integer.toString(sum % 10) + result;
            i--;
        }

        while(j >= 0) {
            int next = Integer.parseInt(String.valueOf(s2.charAt(j)));
            int sum = next + move;
            move = sum / 10;
            result = Integer.toString(sum % 10) + result;
            j--;
        }



        if (move != 0) {
            result = Integer.toString(move) + result;
        }
        return result;
    }
}
