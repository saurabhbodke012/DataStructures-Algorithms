package DataStructure_1;

public class Day3 {

    public int maxProfit(int[] prices) {

        if(prices.length <=1){
            return 0;
        }

        int min = prices[0];
        int profit = prices[1] - prices[0];

        for(int i=1; i<prices.length; i++){

            profit = Math.max(profit, prices[i] - min);
            min = Math.min(prices[i], min);

        }

        if(profit< 0){
            return 0;
        }else{
            return profit;
        }
    }
}
