package Arrays_and_Strings;

public class PivotIndex {

    public int pivotIndex(int[] nums) {

        int sum =0;

        int left=0;

        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }

        for(int i=0; i< nums.length; i++){


            sum = (sum - nums[i]);

            if(left == sum){
                return i;
            }

            left = left + nums[i];
        }

        return -1;

    }

}
