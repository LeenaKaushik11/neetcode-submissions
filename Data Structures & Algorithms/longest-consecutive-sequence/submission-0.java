class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs= new HashSet<Integer>();
        for (int num : nums) {
            hs.add(num);
        }
        int fina = 0;
        for (int i = 0; i<nums.length ;i++) {
            if (hs.contains(nums[i]-1)) continue;
            int temp = 1;
            while(hs.contains(nums[i]+temp)) {
              temp++; 
            }
         fina = Math.max(temp, fina);
        }
        return fina;
    }
}
