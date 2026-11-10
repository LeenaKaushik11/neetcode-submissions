class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        List<List<Integer>> res = new ArrayList<>();
        while(i<nums.length){
            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }
            System.out.println(i);
            int left = i + 1;
            int right = nums.length - 1;
            while(left<right){
                int sum= (nums[left]+nums[right]+nums[i]);
                if(sum ==0){
                    res.add(Arrays.asList(nums[i], nums[left],nums[right]));
                    left++;
                    right--;
                    // Skip duplicate second values
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                } else if(sum >0){
                    right--;
                } else {
                   left++;
                }
            }
            i++;
        }
        return res;
    }
}
