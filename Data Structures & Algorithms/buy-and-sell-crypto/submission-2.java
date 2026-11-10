class Solution {
    public int maxProfit(int[] prices) {
        int l=0,r=1;
        int maxR = 0;
        int n= prices.length;
        for( r=1;r<n;r++){
            if(prices[r]>prices[l]){
                maxR= Math.max(maxR,prices[r]-prices[l]);
            } else{
                l=r;
            }
        } 
        return maxR;
    }
}
