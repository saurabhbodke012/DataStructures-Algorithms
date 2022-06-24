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

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int index1 = m - 1;
        int index2 = n - 1;


        for (int i = nums1.length-1; i >= 0; i--) {
            if (index2 < 0) {
                break;
            }
            if (index1 >= 0 && nums1[index1] > nums2[index2]) {
                nums1[i] = nums1[index1];
                index1--;
            } else {
                nums1[i] = nums2[index2];
                index2--;
            }
        }
    }
}
