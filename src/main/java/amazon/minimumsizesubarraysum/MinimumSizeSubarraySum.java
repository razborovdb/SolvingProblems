package amazon.minimumsizesubarraysum;

public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        for (int l = 0, r = 0; r < nums.length; ++r) {
            sum += nums[r];
            while (sum >= target) {
                ans = Math.min(ans, r - l + 1);
                sum -= nums[l++];
            }
        }
        return ans != Integer.MAX_VALUE ? ans : 0;
    }

    public static int minSubArrayLen2(int target, int[] nums) {int ans = Integer.MAX_VALUE;

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int length = 0;
        int startIndex = 0;
        for (int i = 0; i < nums.length;i++) {
            sum += nums[i];
            length++;
            System.out.println("i = " + i + "; sum = " + sum + "; length = " + length + "; startIndex = " + startIndex);
            if (sum == target) {
                if (length < min) {
                    min = length;

                }
                sum -= nums[startIndex];
                startIndex++;
                length--;
            } else if (sum > target) {
                while (sum > target) {
                    sum -= nums[startIndex];
                    startIndex++;
                    length--;
                }
                if (sum == target) {
                    if (length < min) {
                        min = length;

                    }
                }
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }


    public static void main(String[] args) {
        // 3
        int arr[] = {1,2,3,4,5};
        System.out.println(minSubArrayLen(11, arr));
    }

}
