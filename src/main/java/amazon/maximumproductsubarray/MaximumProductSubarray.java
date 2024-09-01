package amazon.maximumproductsubarray;

public class MaximumProductSubarray {

    public static int maxProduct(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int curProduct = nums[0];
        int maxProduct = nums[0];
        int minProduct = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int next = nums[i];
            int prevMin = minProduct;
            int prevMax = maxProduct;
            if (next < 0) {
                minProduct = Math.min(prevMax * next, next);
                maxProduct = Math.max(prevMin * next, next);
            } else {
                minProduct = Math.min(prevMin * next, next);
                maxProduct = Math.max(prevMax * next, next);
            }
            curProduct = Math.max(maxProduct, curProduct);
        }
        return curProduct;
    }

    public static void main(String[] args) {
        // 6
        int[] nums = {-2,1,-3};
        System.out.println(maxProduct(nums));
    }
}
