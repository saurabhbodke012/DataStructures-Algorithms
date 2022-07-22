package Arrays_and_Strings;

import java.util.HashMap;

public class TwoSum_II {

    public int[] twoSum(int[] numbers, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[2];

        for(int i=0; i<numbers.length; i++){

            if( map.containsKey( target-numbers[i]) ){
                arr[1] = i+1;
                arr[0] = map.get( target - numbers[i]) +1;
            }

            map.put(numbers[i], i);
        }

        return arr;
    }
}
