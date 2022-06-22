package DataStructure_1;

import Recursion1.TreeNode;

import java.util.HashMap;

public class Day2 {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res= new int[2];

        for(int i=0; i<nums.length;i++){

            if(map.containsKey(target -  nums[i])){
                res[0]= i;
                res[1]= map.get(target- nums[i]);
            }else{
                map.put(nums[i], i);
            }

        }

        return res;
    }

    public int maxDepth(TreeNode root) {

        if(root== null){
            return 0;
        }

        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }
}
