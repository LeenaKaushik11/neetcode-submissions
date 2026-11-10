class Solution {
    public int trap(int[] height) {
        
        //store lmax and r max for each index then subtact height from the min of these 
        //and then we chck if the required is >0
        int len= height.length;
        int lmax= height[0], rmax =height[len-1];
        int l = 0;
        int r = len-1;
        int res=0;
        while(l<r){
            //System.out.println(l+" "+r);
            if(lmax<=rmax){
                l++;
                lmax= Math.max(lmax, height[l]);
                res+=lmax-height[l];
            } else{
                r--;
                rmax= Math.max(rmax, height[r]);
                res+=rmax-height[r];
            }
            // System.out.println(res);
        }
        return res;
    }
}
