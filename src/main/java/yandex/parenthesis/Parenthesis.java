package yandex.parenthesis;

import java.io.IOException;

public class Parenthesis {
    public static int n = 0;
    public static void main(String[] args) throws IOException {
//        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(r.readLine());
//        if (n <= 0) {
//            return;
//        }
        Parenthesis p = new Parenthesis();
        n = 3;
        p.recursion(0,0, "");
    }
    public void recursion(int left, int right, String result) {
        if (left >= n && right >= n) {
            System.out.println(result);
        }

        if (left < n) {
            recursion(left+1, right, result + "(");
        }
        if (right < left) {
            recursion(left, right+1, result + ")");
        }

    }
}
