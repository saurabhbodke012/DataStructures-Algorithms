package DataStructure_1;

import java.util.HashMap;

public class Day6 {
    public int firstUniqChar(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            map.put( s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1 );
        }

        for(int i=0; i<s.length(); i++){
            if( map.get(s.charAt(i)) == 1 ){
                return i;
            }
        }

        return -1;

    }


    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> ransom = new HashMap<>();
        HashMap<Character, Integer> mag = new HashMap<>();


        for(int i=0; i<ransomNote.length(); i++){

            ransom.put(ransomNote.charAt(i), ransom.getOrDefault(ransomNote.charAt(i),0) + 1 );

        }


        for(int i=0; i<magazine.length(); i++){

            mag.put(magazine.charAt(i), mag.getOrDefault(magazine.charAt(i),0) + 1 );

        }

        for(int i=0; i<ransomNote.length(); i++){

            if(mag.containsKey(ransomNote.charAt(i))){

                if( ransom.get(ransomNote.charAt(i)) > mag.get(ransomNote.charAt(i))  ){
                    return false;
                }else{
                    continue;
                }

            }else{
                return false;
            }

        }

        return true;

    }


    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        int[] count = new int[26];

        for(int i=0; i<s.length(); i++){

            count[s.charAt(i) - 'a'] --;
            count[t.charAt(i) - 'a'] ++;

        }

        for(int i=0; i<26; i++){

            if(count[i] !=0){
                return false;
            }
        }

        return true;

    }
}
