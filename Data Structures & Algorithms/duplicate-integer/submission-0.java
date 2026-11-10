class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Boolean> hm = new HashMap<Integer,Boolean>();
        for (int i =0;i<nums.length;i++) {
            if(hm.containsKey(nums[i])) return true;
            hm.put(nums[i],true);
        }
        return false;
    }
}