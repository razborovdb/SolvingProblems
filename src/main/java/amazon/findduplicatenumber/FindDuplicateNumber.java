package amazon.findduplicatenumber;

public class FindDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        if (nums.length <= 1) return -1;
        int slow = 0;
        int fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);
        fast = 0;
        while(fast != slow){
            fast = nums[fast];
            slow = nums[slow];
        }
        return fast;
    }

    public static void main(String args[]) {
        int arr[] = {1,3,4,2,1};
        System.out.println("The duplicate element is " + findDuplicate(arr));
    }
}
