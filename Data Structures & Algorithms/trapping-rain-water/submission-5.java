class Solution {
    public int trap(int[] height) {
        int len = height.length;
        if(len ==0) return 0;
        int watertrap=0;
        int left=0, right=len-1;
        int leftmax = height[0], rightmax = height[len-1];
        while(left<right){
        if(height[left]<=height[right]) {
            watertrap += Math.min(Math.max(leftmax,height[left]),rightmax)-height[left];
            //System.out.println(watertrap+ " left : "+height[left]);
            left++;
            leftmax=Math.max(leftmax, height[left]);
        } else {
            watertrap += Math.min(leftmax,Math.max(rightmax,height[right]))-height[right];
            //System.out.println(watertrap+ " right : "+ height[right]);
            right--; 
            rightmax=Math.max(rightmax, height[right]);
        }}
        return watertrap;
    }
}
