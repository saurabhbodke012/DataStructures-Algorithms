package Recursion1;

import java.util.HashMap;

public class June22nd {

    HashMap<Integer, Integer> cache1 = new HashMap<Integer, Integer>();

    public int fib(int n) {

        if(cache1.containsKey(n)){
            return cache1.get(n);
        }

        int res=0;

        if(n<2){
            res= n;
        }else{
            res= fib(n-1) + fib(n-2);
        }

        cache1.put(n, res);
        return res;

    }

    HashMap<Integer, Integer> cache2 = new HashMap<Integer, Integer>();

    public int climbStairs(int n) {

        if(cache2.containsKey(n)){
            return cache2.get(n);
        }

        int res=0;

        if(n<4){
            res=n;
        }else{
            res= climbStairs(n-1)+ climbStairs(n-2);
        }

        cache2.put(n,res);
        return res;

    }

}
