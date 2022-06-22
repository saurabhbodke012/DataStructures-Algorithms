package DSA_Jan2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Jan14 {

    public static void permute(int[] nums) {

        helper(nums, 0);

    }


    public static void helper(int[] nums, int index){

        if(index == nums.length-1){
            System.out.println(Arrays.toString(nums));
            return;
        }

        for(int i= index; i< nums.length; i++){
            swap(nums,i, index);
            helper(nums, index+1);
            swap(nums,index, i);

        }
    }

    public static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a]= nums[b];
        nums[b]= temp;
    }


    public static void main(String[] args) {

        int[] nums={1,2,3};
        permute(nums);

    }
}
