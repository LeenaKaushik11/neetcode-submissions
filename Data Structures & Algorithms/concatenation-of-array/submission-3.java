class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length*2];
        int j=0;
        for(int i: nums){
            res[j]=i;
            res[j+nums.length]=i;
            j++;
        }
        return res;
    }
}