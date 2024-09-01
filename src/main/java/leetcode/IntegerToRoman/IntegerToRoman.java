package leetcode.IntegerToRoman;

public class IntegerToRoman {
    public static void main(String[] args) {
        //answer MCMXCIV
        int num = 1994;
        System.out.println(intToRoman(num));
    }

    public static String intToRoman(int num) {
        String result = "";
        int value = num;
        int m = value / 1000;
        if(m > 0) {
            for (int i = 0; i < m; i++) {
                result = result + "M";
            }
        }
        value %= 1000;
        int cdm = value / 100;
        switch (cdm) {
            case 9:
                result = result + "CM";
                break;
            case 8:
                result = result + "DCCC";
                break;
            case 7:
                result = result + "DCC";
                break;
            case 6:
                result = result + "DC";
                break;
            case 5:
                result = result + "D";
                break;
            case 4:
                result = result + "CD";
                break;
            case 3:
                result = result + "CCC";
                break;
            case 2:
                result = result + "CC";
                break;
            case 1:
                result = result + "C";
                break;
        }
        value %= 100;
        int xlv = value / 10;
        switch (xlv) {
            case 9:
                result = result + "XC";
                break;
            case 8:
                result = result + "LXXX";
                break;
            case 7:
                result = result + "LXX";
                break;
            case 6:
                result = result + "LX";
                break;
            case 5:
                result = result + "L";
                break;
            case 4:
                result = result + "XL";
                break;
            case 3:
                result = result + "XXX";
                break;
            case 2:
                result = result + "XX";
                break;
            case 1:
                result = result + "X";
                break;
        }

        value %= 10;
        switch (value) {
            case 9:
                result = result + "IX";
                break;
            case 8:
                result = result + "VIII";
                break;
            case 7:
                result = result + "VII";
                break;
            case 6:
                result = result + "VI";
                break;
            case 5:
                result = result + "V";
                break;
            case 4:
                result = result + "IV";
                break;
            case 3:
                result = result + "III";
                break;
            case 2:
                result = result + "II";
                break;
            case 1:
                result = result + "I";
                break;
        }
        return result;
    }

}
