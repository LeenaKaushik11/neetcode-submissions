class Solution {
    public int majorityElement(int[] nums) {
        int len= nums.length;
        int cur=nums[0];
        int count=1;
        for(int i=0;i<len;i++){
            if(count==0 && nums[i]!=cur){
                count++;
                cur=nums[i];
            }
            if(nums[i] ==cur){
                count++;
            } else{
                count--;
            }
        }
        return cur;
    }
}