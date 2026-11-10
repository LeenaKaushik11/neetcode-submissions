class Solution {
    public int maxProfit(int[] prices) {
        int lmax=prices[0];
        int l=0;
        int len=prices.length;
        if(len==1) return 0;
        int r= 1;
        int res=0;
        while(r<len){
            if(prices[r]>prices[l]){
               res = Math.max(prices[r]-prices[l],res);
            } if(prices[r]<prices[l]){
                l=r;
            }
            r++;
        }
        return res;

    }
}
