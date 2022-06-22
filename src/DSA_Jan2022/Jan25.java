package DSA_Jan2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Jan25 {

    public static int sumOfNumbers(int n){

        if(n==0){
            return 0;
        }

        return n + sumOfNumbers(n-1);
    }

    public static int factorial(int n){
        if(n ==1){
            return 1;
        }

        return n * factorial(n-1);
    }

    public static boolean palindrome (String s,int i){
        if( i > s.length()/2){
            return true;
        }

        if(s.charAt(i) != s.charAt(s.length()-i-1)){
            return false;
        }

        return palindrome(s,i+1);
    }

    public static int fibonacci(int n){

        if(n <=1){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);

    }

    public static void subsequence(ArrayList<Integer> res, int ind, int[] arr){

        if(ind>= arr.length){
            System.out.println(Arrays.toString(res.toArray()));
            return;
        }
        res.add(arr[ind]);
        subsequence(res, ind+1, arr);
        res.remove(arr[ind]);
        subsequence(res, ind+1, arr);

    }

    public static void main(String[] args) {

        ArrayList<Integer> res= new ArrayList<>();
        int[] arr= {3,1,2};
//        System.out.println(sumOfNumbers(3));
//        System.out.println(factorial(5));
//        System.out.println(palindrome("abccba", 0));
//        System.out.println(fibonacci(4));
        subsequence(res, 0, arr);
    }
}
