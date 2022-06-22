package DataStructure_Jan22;

public class DayEleven {

    public static void naivePatternSearch(String s, String pat){

        int n = pat.length();
        String temp="";
        for(int i=0; i<s.length(); i++){
            temp = s.substring(i, n);

            if(temp.equals(pat)){
                System.out.println("Index : " + i);
            }

            n= n+i;

            if(n == s.length() || n> s.length()){
                temp = s.substring(i+1, s.length());

                if(temp.equals(pat)){
                    System.out.println(i);
                }

                break;
            }
        }

    }

    public static void main(String[] args) {

        String s="ABABABCD";
        String pat="ABAB";

        naivePatternSearch(s,pat);
    }

}
