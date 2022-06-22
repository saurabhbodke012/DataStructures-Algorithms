package DataStructure_Jan22;

import java.util.Arrays;

public class DayThree {
    public static void sortColors(int[] nums) {

//        for(int i=0; i<nums.length-1; i++){
//            int temp=0;
//            if(nums[i] > nums[i+1]){
//                temp = nums[i];
//                nums[i] = nums[i+1];
//                nums[i+1] = temp;
//            }
//        }

        int start=0;
        int end =nums.length-1;

        while (start<end){
            int temp=0;
            if(nums[start] > nums[end]) {
                temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }
            start++;
            end--;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {

        int[] arr={0,1,2,2,1,0};
        sortColors(arr);

    }
}
