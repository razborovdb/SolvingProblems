package leetcode.TrappingRainWater_42;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
    public static int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxL = 0;
        int maxR = 0;
        int sum = 0;
        while (left <= right) {
            if (maxL <= maxR) {
                sum += Math.max(0, maxL - height[left]);
                maxL = Math.max(maxL,height[left]);
                left++;
            } else {
                sum += Math.max(0, maxR - height[right]);
                maxR = Math.max(maxR,height[right]);
                right--;
            }
        }
        return sum;
    }
}
