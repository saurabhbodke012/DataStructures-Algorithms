package Arrays101;

public class FindEvenDigitsNumber {

    public int findNumbers(int[] nums) {

        int ans=0;

        for(int i=0; i<nums.length; i++){

            if(digits(nums[i]) % 2 == 0 ){
                ans++;
            }

        }

        return ans;

    }

    public int digits(int n){

        int count=0;

        while(n > 0){
            n=n/10;
            count++;
        }

        return count;

    }

}
