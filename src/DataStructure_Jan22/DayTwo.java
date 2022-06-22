package DataStructure_Jan22;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class DayTwo {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] res = new int[2];

        for(int i=0; i<nums.length; i++){

            if(map.containsKey(target-nums[i])){
                res[0] = i;
                res[1] = map.get(target-nums[i]);
            }

            map.put(nums[i], i);
        }
        return res;
    }

//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int nums1Index = 0;
//         int nums2Index = 0;
//         for(int i=m;i<nums1.length;i++){
//             nums1[i]=nums2[nums2Index];
//             nums2Index++;
//         }
//         for(int i=0; i < nums1.length; i++) {
//             for(int index=i; index > 0 && nums1[index] < nums1[index-1]; index-- ) {
//                 int temp = nums1[index];
//                 nums1[index] = nums1[index-1];
//                 nums1[index-1] = temp;

//             }
//         }
//     }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index=0;
        for (int i=m; i<(m+n); i++){
            nums1[i] = nums2[index];
            index++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }


    public int finalInstances(int instances, int[] averageUtil){

        for (int i=0; i< averageUtil.length; i++ ){
            if (averageUtil[i] < 25 && instances >1){
                instances = (int)(Math.ceil(instances/2.0));
            }

            if (i< averageUtil.length && averageUtil[i] > 60 && instances < 200000000){
                instances *= 2;
                i +=10;
            }
        }

        return instances;
    }

    public static String addStrings(String num1, String num2) {
        String str="";

        int carry=0;
        int index1= num1.length()-1;
        int index2= num2.length()-1;

        while(index1>=0 || index2 >=0){
            int nums1=0;
            int nums2=0;
            if(index1>=0){
                nums1= num1.charAt(index1) ;
                nums1= nums1 - '0';
            }else{
                nums1=0;
            }

            if(index2>=0){
                nums2= num2.charAt(index2) - '0';
                nums2= nums2 - '0';
            }else{
                nums2=0;
            }

            int value = (nums1 + nums2 + carry) %10;
            carry = (nums1 + nums2 + carry) /10;

            str= str + (Integer.toString(value));
            index1--;
            index2--;
        }

        if(carry !=0){
            str= str + (Integer.toString(carry));
        }

        return new StringBuilder(str).reverse().toString();
    }



    public static String removeDuplicates(String s) {

        if(s.length()<2){
            return s;
        }

        Stack<Character> stack = new Stack<Character>();
        stack.push(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            Character ch = stack.peek();
            if(s.charAt(i) == (ch)){
                stack.pop();
                i++;
            }
            stack.push(s.charAt(i));
        }

        String str= stack.toString();
//        removeDuplicates(str);
        return removeDuplicates(str);
    }



    public static void main(String[] args) {
       String number1= "abbaca";
       String number2= "123";

//        System.out.println(addStrings(number1,number2));
        System.out.println(removeDuplicates(number1));
    }

}
