
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Build the frequency map
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }
        
        // 2. Create the buckets
        // The array size is nums.length + 1 because a frequency can be exactly nums.length
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int key : freqMap.keySet()) {
            int frequency = freqMap.get(key);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }
        
        // 3. Gather the top k elements by iterating backwards
        int[] result = new int[k];
        int counter = 0;
        
        for (int i = buckets.length - 1; i >= 0 && counter < k; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    result[counter++] = num;
                    if (counter == k) {
                        return result; // We found our k elements, stop immediately
                    }
                }
            }
        }
        
        return result;
    }
}