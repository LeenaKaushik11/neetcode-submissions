class Solution {
    public int maxArea(int[] hs) {
        int l = 0, r = hs.length - 1;
        int area=-1;
        int res= -1;
        while (l<r){
            System.out.println(hs[r]+" "+hs[l]);
            area= Math.min(hs[r],hs[l])*(r-l);
            res= Math.max(area,res);
            if(hs[l]<hs[r]){
                l++;
            } else{
                r--;
            }
        }
        return res;
    }
}
