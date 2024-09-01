package amazon.productofarrayexceptself;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prod = new int[n];
        int temp = 1;

        for (int i = 0; i < n; i++) {
            prod[i] = temp;
            temp *= nums[i];
        }

        temp = 1;

        for (int i = n-1; i >= 0; i--) {
            prod[i] *= temp;
            temp *= nums[i];
        }

        return prod;

    }
    public static void main(String[] args)
    {

        int arr[] = { 10, 3, 5, 6, 2 };
        int n = arr.length;
        // Output: prod[]  = {180, 600, 360, 300, 900}
        System.out.println("The product array is : ");
        int[] result = productExceptSelf(arr);
        for (int i: result) {
            System.out.print(i + "; ");
        }
    }
}
