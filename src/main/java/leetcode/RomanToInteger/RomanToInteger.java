package leetcode.RomanToInteger;

public class RomanToInteger {
    public static void main(String[] args) {
        //answer 1994
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char nextC = ' ';
            if (i < s.length()-1) {
                nextC = s.charAt(i+1);
            }
            switch(c) {
                case 'M':
                    result += 1000;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'C':
                    if (nextC != 'M' && nextC != 'D') {
                        result += 100;
                    } else {
                        if (nextC == 'M') {
                            result += 900;
                        }
                        if (nextC == 'D') {
                            result += 400;
                        }
                        i++;

                    }
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'X':
                    if (nextC != 'L' && nextC != 'C') {
                        result += 10;
                    } else {
                        if (nextC == 'C') {
                            result += 90;
                        }
                        if (nextC == 'L') {
                            result += 40;
                        }
                        i++;

                    }
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'I':
                    if (nextC != 'V' && nextC != 'X') {
                        result += 1;
                    } else {
                        if (nextC == 'X') {
                            result += 9;
                        }
                        if (nextC == 'V') {
                            result += 4;
                        }
                        i++;

                    }
                    break;
            }
        }
        return result;
    }
}
