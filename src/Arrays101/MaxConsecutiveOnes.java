package Arrays101;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {

        int count=0;
        int ans=0;

        for(int i=0; i<nums.length; i++){

            if(nums[i] == 1){
                count++;
            }else{
                ans= Math.max(count,ans);
                count=0;
            }

        }

        return Math.max(count,ans);
    }

}
