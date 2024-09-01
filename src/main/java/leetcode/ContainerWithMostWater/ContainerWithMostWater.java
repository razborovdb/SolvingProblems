package leetcode.ContainerWithMostWater;

public class ContainerWithMostWater {
    public static void main(String[] args)
    {
        //answer 6, 12
        int a[] = { 1, 5, 4, 3 };
        int b[] = { 3, 1, 2, 4, 5 };

        System.out.println(maxArea(a));
        System.out.println(maxArea(b));
    }
    public static int maxArea(int[] height) {
        int ans = 0, i = 0, j = height.length-1, res = 0;
        while (i < j) {
            if (height[i] <= height[j]) {
                res = height[i] * (j - i);
                i++;
            } else {
                res = height[j] * (j - i);
                j--;
            }
            if (res > ans) ans = res;
        }
        return ans;
    }
}
