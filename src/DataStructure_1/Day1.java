package DataStructure_1;

import java.util.HashMap;

public class Day1 {

    public static boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i],i);
            }
        }
        return false;
    }

    public static int maxSubArray(int[] nums) {

        if(nums.length<=1){
            return nums[0];
        }
        int res= nums[0];
        int end= nums[0];

        for(int i=1; i<nums.length; i++){
            end= Math.max(end + nums[i], nums[i]);
            res= Math.max(end, res);
        }

        return res;
    }
}
