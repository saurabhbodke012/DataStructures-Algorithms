package DSA_Jan2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jan26 {

    public static void subsequence(ArrayList<Integer> res, int ind, int[] arr, int sum, int target){

        if(ind == arr.length){
            if(sum == target ){
                System.out.println(Arrays.toString(res.toArray()));
            }
            return;
        }
        res.add(arr[ind]);
        sum = sum + arr[ind];
        subsequence(res, ind+1, arr, sum,target);
        res.remove(arr[ind]);
        sum = sum - arr[ind];
        subsequence(res, ind+1, arr, sum, target);

    }

    public static List<List<Integer>> combinationSum1(int[] arr, int target){
        List<List<Integer>> res= new ArrayList<>();
        helper1(0, arr, target, res, new ArrayList<>());
        return res;

    }

    public static void helper1(int ind, int[] arr, int target, List<List<Integer>> res, List<Integer> list){
        if(ind == arr.length){
            if(target == 0){
                res.add(new ArrayList<>(list));
            }
            return;
        }

        if(arr[ind]<=target){
            list.add(arr[ind]);
            helper1(ind,arr,target- arr[ind], res, list);
            list.remove(list.size()-1);
        }

        helper1(ind+1, arr, target, res, list);

    }


    public static List<List<Integer>> combinationSum2(int[] arr, int target){
        List<List<Integer>> res= new ArrayList<>();
        Arrays.sort(arr);
        helper2(0, arr, target, res, new ArrayList<>());
        return res;

    }

    public static void helper2(int ind, int[] arr, int target, List<List<Integer>> res, List<Integer> list){
        if(target == 0){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i=ind; i<arr.length; i++){
            if(i>ind && arr[i] ==  arr[i-1]){
                continue;
            }
            if(arr[i] > target){
                break;
            }
            list.add(arr[i]);
            helper2(i+1,arr,target- arr[i], res, list);
            list.remove(list.size()-1);
        }
    }




    public static void main(String[] args) {
        ArrayList<Integer> res= new ArrayList<>();
        int[] arr= {2,5,2,1,2};
        int sum=0;
//        subsequence(res, 0, arr,sum, 2 );

        System.out.println(combinationSum2(arr, 5));
    }
}
