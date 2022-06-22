package DataStructure_Jan22;

import java.util.Arrays;

public class DayOne {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];
        for(int i=1;i<nums.length;i++){
            currSum = Math.max(nums[i],currSum+nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
