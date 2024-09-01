package training.stringrearragment;

public class StringRearrangment {
    public static boolean res = false;
    static int sL = 0;

    public static void main(String[] args) {
        String[] inputArray =  new String[] { "abc", "abx", "axx", "abx", "abc"};
        System.out.println(solution(inputArray));
        inputArray =  new String[] { "aba", "bbb", "bab"};
        System.out.println(solution(inputArray));
    }
    public static boolean solution(String[] inputArray) {
        sL = inputArray.length;
        res = false;

        permute(inputArray,inputArray.length);

        return res;
    }

    public static void permute(String[] arr, int size) {

        if (size<2) {
            //printMy(arr);
            for(int j = 1; j< sL;j++) {

                if(!compareStr(arr[j],arr[j-1])) {
                    return;
                }
                //System.out.println(b1);
            }
            res = true;
        } else {
            for (int k = 0; k <size ; k++) {
                swap(arr,k,size - 1);
                permute(arr,size - 1);
                swap(arr,size - 1,k);
            }
        }
    }

    public static void swap(String[] arr, int k, int i) {
        String tmp = arr[k];
        arr[k] = arr[i];
        arr[i] = tmp;
    }

    public static void printMy(String s[]) {
        int iL = s.length;

        for(int i =0;i<iL;i++) {
            System.out.println(s[i]);
        }
        System.out.println();
    }

    public static boolean compareStr(String s1, String s2) {
        boolean result = false;
        int numDif = 0;
        int i1 = s1.length();
        int i2 = s2.length();
        if(i1 == i2) {
            for(int i = 0;i<i1;i++) {
                if(s1.charAt(i) != s2.charAt(i)) {
                    numDif++;

                }
                //System.out.println(numDif);
            }
            if(numDif==1) result=true;
        }

        //System.out.println();


        return result;
    }

}
