package DataStructure_Jan22;

import java.util.*;

public class DayNine {

    public static int countDistinctElements(int[] arr){

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){

            if(map.containsKey(arr[i])){
                continue;
            }else{
                map.put(arr[i], i);
            }

        }

        return map.size();

    }

    public static int[] intersectionOfArrays(int[] arr1, int[] arr2){

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();


        for(int i=0; i<arr1.length; i++){
            set1.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++){
            set2.add(arr1[i]);
        }

        for(int s: set1){
            if(set2.contains(s)){
                list.add(s);
            }
        }

        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }

        return arr;
    }

    public static int unionOfArrays(int[] arr1, int[] arr2){

        int count=0;

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i: arr1){
            set1.add(i);
        }

        count= set1.size();

        for(int i=0; i<arr2.length; i++){
            if(set1.contains(arr2[i])){
                continue;
            }else{
                count++;
            }
        }
        return count;
    }


    public static void frequencyOfElements(int[] arr){
        int count=1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){

            map.put(arr[i], map.getOrDefault(arr[i],0)+1 );
        }

        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }


    public static int[] twoSum(int[] arr, int sum){
        int[] res= new int[2];

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){

            if(map.containsKey(sum-arr[i])){
                res[0]= arr[i];
                res[1] = arr[map.get(sum-arr[i])];
            }else{
                map.put(arr[i], i);
            }

        }

        return res;

    }

    public static void main(String[] args) {
        int[] arr1= {9,15,15,-5};
        int[] arr2= {15,15,15,15,14};

        System.out.println(Arrays.toString(twoSum(arr1,10)));
    }
}
