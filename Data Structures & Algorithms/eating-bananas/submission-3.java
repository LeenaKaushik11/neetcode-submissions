class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //if(piles.length == 1) return piles[0] > h ? (int)Math.ceil(piles[0]/h) : 1;
        int maxH= 0;
        for(int pi: piles){
            maxH= Math.max(maxH, pi);
        }
        
        int low=1;
        int high=maxH;
        int res= high;
        while(low<=high){
            int mid= low + (high-low)/2;
            long nums =0;
            for(int pi:piles){
                nums+=Math.ceil((double)pi/mid);
            }
            if(nums<=h){
                res=mid;
                high=mid-1;
            } else {
                low = mid+1;
            }
        }
        return res;
    }
}
