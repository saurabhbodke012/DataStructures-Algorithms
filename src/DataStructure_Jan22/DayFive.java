package DataStructure_Jan22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DayFive {

    public static void leftRotateArrayByOne(int[] arr){
        int temp = arr[0];

        for(int i=1;i<arr.length; i++){
            arr[i-1] = arr[i];
        }

        arr[arr.length-1]=temp;

        System.out.println(Arrays.toString(arr));

    }

    public static void leftRotateArrayByD(int[] arr, int d){

        reverseArray(arr, 0, d-1);
        reverseArray(arr, d, arr.length-1);
        reverseArray(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));

    }

    public static int[] reverseArray(int[] arr, int start, int end){
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

    public static void leadersArray(int[] arr){
        int leader = arr[arr.length-1];
        System.out.println(leader);
        for(int i=arr.length-2; i>=0; i--){

            if(leader < arr[i]) {
                leader = arr[i];
                System.out.println(leader);
            }

        }
    }

    public static void maxDifference(int[] arr){
       int res = arr[0] - arr[1];
       int minVal = arr[0];

       for(int j=1; j<arr.length; j++){
           res = Math.max(res, arr[j] - minVal);
           minVal = Math.min(minVal, arr[j]);
       }

        System.out.println(res);
    }

    public static void frequency(int[] arr){

        int count =1;
        int index=0;
        for(int i=1; i<arr.length; i++){

            if(arr[index] != arr[i] ){
                System.out.println("Element: " + arr[index] + " has appeared " + count + " times.");
                count=1;
                index++;
            }else{
                count++;
                index++;
            }

            if(i==arr.length -1){
                System.out.println("Element: " + arr[index] + " has appeared " + count + " times.");
            }
        }
    }

    public static void stock(int[] arr){
        int res = arr[0] - arr[1];
        int minVal = arr[0];
        int profit=0;
        for(int j=1; j<arr.length; j++){
            res = Math.max(res, arr[j] - minVal);
            minVal = Math.min(minVal, arr[j]);

        }
    }

    public static List<Integer> numberOfItems(String s, List<Integer> startIndices, List<Integer> endIndices) {
        String items = "";
        List<Integer> itemList = new ArrayList<>();
        for(int i=0;i<Math.min(startIndices.size(), endIndices.size());i++) {
            items = s.substring(startIndices.get(i)-1,endIndices.get(i));
            char[] itemChars = items.toCharArray();
            int pair = 0;
            int compCount = 0;
            int cumComCount = 0;
            for(char itemChar: itemChars) {
                if(itemChar == '|' && pair == 0) {
                    pair++;
                    compCount = 0;
                } else if(itemChar == '|' && pair == 1) {
                    if(compCount>0) {
                        cumComCount += compCount;
                    }
                    compCount = 0;
                } else if(itemChar == '*' && pair == 1) {
                    compCount += 1;
                }
            }
            itemList.add(cumComCount);
        }
        return itemList;
    }

    public static void main(String[] args) {
        String s= "*|*|*|";
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(6);
        System.out.println(numberOfItems(s,list,list2));

    }
}
