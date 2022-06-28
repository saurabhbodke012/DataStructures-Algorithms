package Recursion_II;

import java.util.Arrays;

public class June28th {

    public int [] sortArray(int [] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        int pivot = nums.length / 2;
        int [] left_list = sortArray(Arrays.copyOfRange(nums, 0, pivot));
        int [] right_list = sortArray(Arrays.copyOfRange(nums, pivot, nums.length));
        return merge(left_list, right_list);
    }

    public int [] merge(int [] left_list, int [] right_list) {
        int [] ret = new int[left_list.length + right_list.length];
        int left_cursor = 0, right_cursor = 0, ret_cursor = 0;

        while (left_cursor < left_list.length &&
                right_cursor < right_list.length) {
            if (left_list[left_cursor] < right_list[right_cursor]) {
                ret[ret_cursor++] = left_list[left_cursor++];
            } else {
                ret[ret_cursor++] = right_list[right_cursor++];
            }
        }

        while (left_cursor < left_list.length) {
            ret[ret_cursor++] = left_list[left_cursor++];
        }
        while (right_cursor < right_list.length) {
            ret[ret_cursor++] = right_list[right_cursor++];
        }
        return ret;
    }


    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    public boolean helper(TreeNode root, Integer low, Integer high){

        if(root == null){
            return true;
        }

        if( (low != null && root.val <=low) || (high != null && root.val >=high)){
            return false;
        }

        return (helper(root.left,low, root.val) && helper( root.right, root.val, high));

    }


}
