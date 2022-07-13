package AmazonOA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumQuality {

    public static long maximumQuality(List<Integer> packets, int channels){
        long res = 0;
        Collections.sort(packets);
        int n = packets.size();
        for (int i = n-1;i>n-channels;i--) {
            res += packets.get(i);
        }
        // 0~n-channels
        int len = n-channels+1;
        // odd
        if ((len&1)==1) {
            res += packets.get(len / 2);
        } else {
            res += (packets.get(len/2) + packets.get(len/2-1)+1)/2;
        }
        return res;
    }

    public static int quality(int[] packets, int channels){
        int n = packets.length;
        if(n==channels) {
            int sum = 0;
            for(int packet : packets){
                sum+=packet;
            }
            return sum;
        }
        Arrays.sort(packets);
        double result = 0;
        for(int i=n-channels+1;i<n;i++) result+=packets[i];
        int m = n-channels+1;
        if(m%2==1){
            result+=packets[((m+1)/2)-1];
        }
        else{
            double val= Math.ceil((double)(packets[((m+1)/2)-1]+packets[m/2])/2);
            result = result+val;
        }
        return (int)result;
    }


    public static void main(String[] args) {

       int[] list = new int[] {2,2,1,5,3};
        System.out.println(quality(list, 2));

    }

}
