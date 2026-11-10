class Solution {
    public int majorityElement(int[] nums) {
        int cur=nums[0];
        int fre=0;
        for(int i:nums) {
            if(fre==0){
                cur=i;
                fre++;
            }
            if(cur!=i){
                fre--;
            } else {
                fre++;
            }
        }
        return cur;
    }
}