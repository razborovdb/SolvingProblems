package yandex.ones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ones {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        if (n <= 0) {
            System.out.println(0);
            return;
        }
        int maxLen = 0;
        int prev = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int next = Integer.parseInt(r.readLine());
            if (next == 1) {
                sum++;
            } else {
                maxLen = Math.max(maxLen, sum);
                sum = 0;
            }

        }
    }
}
