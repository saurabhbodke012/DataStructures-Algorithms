package Arrays101;

public class SortedSquares {

    public int[] sortedSquares(int[] nums) {

        int start=0;
        int end= nums.length-1;

        int n= nums.length - 1;
        int[] res= new int[nums.length];


        while(start <= end){

            if( Math.abs(nums[start]) >= Math.abs(nums[end]) ){

                res[n] = nums[start]*nums[start];
                start++;

            }else{

                res[n] = nums[end]*nums[end];
                end--;

            }

            n--;

        }

        return res;

    }

}
