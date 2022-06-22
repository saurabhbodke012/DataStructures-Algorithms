package DataStructure_Jan22;

import java.util.HashMap;

public class DayTen {

    public static boolean stringPalindrome(String str){

        int start=0;
        int end=str.length()-1;

        while (start<end){

            if(str.charAt(start) != str.charAt(end)){
                return false;
            }

            start++;
            end--;

        }

        return true;
    }

    public static int leftMostRepeating(String s){

        int index = Integer.MAX_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();


        for(int i=0; i<s.length(); i++){

            if(map.containsKey(s.charAt(i))){
                index = Math.min(index, map.get(s.charAt(i)));
            }else{
                map.put(s.charAt(i), i);
            }
        }

        if(index == Integer.MAX_VALUE){
            return -1;
        }else{
            return index;

        }


    }

    public static int lengthOfLongestSubstring(String s) {
        Integer[] chars = new Integer[128];

        int left = 0;
        int right = 0;

        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);

            Integer index = chars[r];
            if (index != null && index >= left && index < right) {
                left = index + 1;
            }

            res = Math.max(res, right - left + 1);

            chars[r] = right;
            right++;
        }

        return res;
    }

    public static int leftMostNonRepeating(String s){

        int index=0;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){



        }


        return 1;
    }


    public static void main(String[] args) {

        String str= "pwwkew";

        System.out.println(lengthOfLongestSubstring(str));



    }

}
