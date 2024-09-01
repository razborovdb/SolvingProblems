package hackerrank.BigDecimal;

import java.math.BigDecimal;

public class BigDecimalTask {
    public static void main(String[] args) {
        String[] s = new String[] {"-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000"};
        solve(s);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    public static void solve(String[] s) {
        for (int i = 0; i < s.length; i++){

            BigDecimal b1 = new BigDecimal(s[i]);
            int i1 = i;
            for (int j = i+1; j < s.length;j++) {
                BigDecimal b2 = new BigDecimal(s[j]);
                //System.out.println("b2 = " + b2);
                if (b2.compareTo(b1) > 0) {
                    b1 = new BigDecimal(s[j]);
                    i1 = j;
                }
            }
            if (i1 != i) {
                String temp = s[i];
                s[i] = s[i1];
                s[i1] = temp;
            }
        }
    }


}
