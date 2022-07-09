package Arrays_and_Strings;

public class DominantIndex {

    public int dominantIndex(int[] nums) {

        int max= nums[0];
        int index=0;

        for(int i=1; i<nums.length; i++){
            max = Math.max(nums[i], max);
        }

        for(int i=0; i<nums.length; i++){

            if(nums[i] == max){
                index= i;
                continue;
            }

            int n = nums[i]*2;

            if( n > max ){
                return -1;
            }

        }

        return index;

    }

}
