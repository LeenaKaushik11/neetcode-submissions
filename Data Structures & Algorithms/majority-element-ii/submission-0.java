class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        List<Integer> res= new ArrayList<Integer>();
        int n=nums.length;
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer, Integer> e: hm.entrySet()){
            if(e.getValue()>n/3) res.add(e.getKey());
        }
        return res;
    }
}