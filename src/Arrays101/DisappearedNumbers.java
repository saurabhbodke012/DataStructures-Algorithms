package Arrays101;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DisappearedNumbers {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashSet<Integer> seen = new HashSet<>();
        int n=1;

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            seen.add(nums[i]);
        }

        for(int i=0; i<nums.length; i++){

            if(!seen.contains(n)){
                arr.add(n);
            }
            n++;

        }

        return arr;

    }

}
