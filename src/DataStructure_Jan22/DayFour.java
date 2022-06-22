package DataStructure_Jan22;

import java.util.Arrays;
import java.util.HashSet;

public class DayFour {

    public static int largestElement(int[] arr){
        int largest = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;

    }

    public static int secondLargestElement(int[] arr){
        int largest = arr[0];
        int secLargest= -1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];
            }else if(arr[i] != largest){
                if(arr[i] > secLargest || secLargest == -1){
                    secLargest = arr[i];
                }
            }
        }

        return secLargest;

    }

    public static boolean sorted(int[] arr){
        int index=0;
        boolean flag= true;
        for(int i=1; i<arr.length; i++){
            if(arr[i] > arr[index] || arr[i] == arr[index]) {
                index++;
                continue;
            }else{
                return false;
            }
        }

        return flag;
    }

    public static int[] reverseArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        int temp=0;

        while(start<end){
            temp= arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }

    public static void removeDuplicates(int[] arr){
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i=0; i< arr.length; i++){
            set.add(arr[i]);
        }

        int res[] = new int[set.size()];
        int i=0;
        for(int element:set){
            res[i++] = element;
        }

        System.out.println(Arrays.toString(res));
    }

    public static void moveZeros(int[] arr){
        int count=0;

        for(int i=0; i<arr.length; i++){

            if(arr[i] !=0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count++;
            }
        }

        System.out.println(Arrays.toString(arr));

    }



    public static void main(String[] args) {
        int[] arr= {1,2,3,0,0,0,4,4,5};
        moveZeros(arr);
    }
}
