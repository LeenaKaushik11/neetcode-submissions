class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] productpre = new int[n];
        int[] productpost = new int[n];
        int[] res= new int[n];
        productpre[0]=1;
        productpost[n-1]=1;
        for(int i=1;i<n;i++) {
            productpre[i]= nums[i-1]*productpre[i-1];

        }
        for(int i=n-2;i>=0;i--) {
            productpost[i]= nums[i+1]*productpost[i+1];
        }
        for(int i=0;i<n;i++){
            res[i]=productpre[i]*productpost[i];
        }
        return res;
        
    }
}  
