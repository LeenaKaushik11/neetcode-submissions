class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> hm= new HashMap<>();
        int res=0;
        int curMax=0;
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(curMax<hm.get(nums[i])){
                curMax=hm.get(nums[i]);
                res=nums[i];
            }
        }
        return res;
    }
}