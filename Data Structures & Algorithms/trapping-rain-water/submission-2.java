class Solution {
    public int trap(int[] height) {
        int l=0;
        int n=height.length;
        int r= height.length-1;
        int maxL=height[0];
        int maxR= height[n-1];
        int res= 0;
        while(l<r){
            if(height[r]<height[l]){
               res+= maxR-height[r] > 0? maxR-height[r] :0;
               maxR= Math.max(height[r],maxR);
               r--;
            } else {
               res+= maxL-height[l] > 0?  maxL-height[l] :0;
               maxL= Math.max(height[l],maxL);
               l++;
            }
        }
        return res;
    }
}
