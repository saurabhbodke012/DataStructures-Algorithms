package Recursion_I;

import java.util.HashMap;

public class fib {
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
}
