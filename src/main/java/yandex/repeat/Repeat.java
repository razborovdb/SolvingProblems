package yandex.repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repeat {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());

        if (n <= 0) {
            //System.out.println(0);
            return;
        }
        int prev = Integer.parseInt(r.readLine());
        System.out.println(prev);
        int next = 0;

        for (int i = 0; i < n-1; i++) {
            next = Integer.parseInt(r.readLine());

            if (prev != next) {
                System.out.println(next);
                prev = next;
            }

        }

    }
}
