class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i: nums){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        List<Integer>[] freq= new List[nums.length+1];
        for(int i=0;i<freq.length;i++){
            freq[i]= new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> e: hm.entrySet()){
            freq[e.getValue()].add(e.getKey());
        }
        // int ind=0;
        int[] res=new int[k];
        for(int i=freq.length-1 , ind=0;i>-1 && ind<k;i--){
            for(int n:freq[i]){
                res[ind++]=n;
                if(ind==k){
                    return res;
                }
            }
        }
        return res;
    }
}
