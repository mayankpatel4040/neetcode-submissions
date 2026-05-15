class Solution {
    public int maxProfit(int[] prices) {
        int m=0;
        int buy = prices[0];
        for(int i =1;i<prices.length;i++){
            if(prices[i]<buy){
                buy = prices[i];
            }
            else{
                m= Math.max(prices[i]- buy,m);
            }
        }
        return m;
    }
}
