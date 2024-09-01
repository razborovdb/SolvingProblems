package training3.stringrearragment;

public class StringRearrangment {

    public static boolean result = false;
    public static void main(String[] args) {
        String[] inputArray =  new String[] { "abc", "abx", "axx", "abx", "abc"};
        System.out.println(solution(inputArray));
        inputArray =  new String[] { "aba", "bbb", "bab"};
        System.out.println(solution(inputArray));


    }

    public static boolean solution(String[] inputArray ) {
        result = false;
        return permute(inputArray, inputArray.length);
        //return result;
    }

    public static boolean permute(String[] inputArray, int size) {
        if (size < 2) {
            for (int i = 1; i < inputArray.length; i++) {
                if (!compare(inputArray[i], inputArray[i-1])) {
                    return false;
                }
            }
            return true;
        }
        for (int i = 0; i < size; i++) {
            swap(inputArray, i, size-1);
            if (permute(inputArray,size-1)) {
                return true;
            }
            swap(inputArray, i, size - 1);
        }
        return false;
    }

    public static void swap(String[] arr, int i1, int i2) {
        String temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    public static boolean compare(String str1, String str2) {
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                count++;
                if (count > 1) return false;
            }
        }
        return count == 1;
    }
}
