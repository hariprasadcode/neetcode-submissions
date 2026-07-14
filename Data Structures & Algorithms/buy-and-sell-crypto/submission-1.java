class Solution {
    public int maxProfit(int[] prices) {

        int maxprofit=0;
        int minprice=prices[0];

        for(int i=1;i<=prices.length-1;i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }
            else{
                int profit=prices[i]-minprice;

                if(profit>maxprofit){
                    maxprofit=profit;
                }

            }
        }
        return maxprofit;
        
    }
}
