class Solution {
    public int maxProfit(int[] prices) {
       int min=Integer.MAX_VALUE;
       int ptft=0;
       for(int i=0;i<prices.length;i++){
        min=Math.min(prices[i],min);
        ptft=Math.max(ptft,prices[i]-min);
       }
       return ptft;
    }
}