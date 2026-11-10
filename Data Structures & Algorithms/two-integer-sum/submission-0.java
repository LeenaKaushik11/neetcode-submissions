class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length;
        int ret[] = new int[2];
        for(int i= 0; i < n; i++) {
            if (hm.containsKey(target - nums[i])) {
                ret[0]=hm.get(target-nums[i]);
                ret[1]=i;
                return ret;
            }
            hm.put(nums[i],i);
        }
        return ret;
    }
}
