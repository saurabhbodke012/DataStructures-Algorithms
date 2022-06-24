package DataStructure_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Day3 {

    public int maxProfit(int[] prices) {

        if(prices.length <=1){
            return 0;
        }

        int min = prices[0];
        int profit = prices[1] - prices[0];

        for(int i=1; i<prices.length; i++){

            profit = Math.max(profit, prices[i] - min);
            min = Math.min(prices[i], min);

        }

        if(profit< 0){
            return 0;
        }else{
            return profit;
        }
    }


    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0, j=0;

        ArrayList<Integer> result= new ArrayList<Integer>();
        while (i< nums1.length && j< nums2.length){
            if (nums1[i] == nums2[j]){
                result.add(nums1[i]);
                i++;
                j++;
            }else if (nums1[i] < nums2[j]){
                i++;
            }else {
                j++;
            }
        }

        int[] arr = new int[result.size()];
        for (int k =0; k<result.size();k++){
            arr[k] = result.get(k);
        }

        return arr;

    }

}
