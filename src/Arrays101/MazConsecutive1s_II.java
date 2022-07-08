package Arrays101;

public class MazConsecutive1s_II {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count =0;
        int i=0;
        int j=0;
        int zero=0;

        while ( j < nums.length){

            if(nums[j] == 0){
                zero++;
            }

            while ( zero > 1 ) {
                if(nums[i]==0 ){
                    zero--;
                }
                i++;
            }

            count = Math.max(count, (j-i)+1);
            j++;

        }

        return count;

    }

}
