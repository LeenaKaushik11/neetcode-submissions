class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs= new HashSet<Integer>();
        for(int i:nums){
            hs.add(i);
        }
        int maxC=0;
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i]-1)) continue;
            int n= nums[i];
            int count=0;
            while(hs.contains(n++)){
                count++;
            }
            maxC= Math.max(count,maxC);
        }
        return maxC;
    }
}
