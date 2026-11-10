class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hm = new HashMap<String,List<String>>();
        for (String s: strs){
            int a[] = new int[26];
            for( char c: s.toCharArray()){
                a[c-'a']++;
            }
            String k= Arrays.toString(a);
            hm.putIfAbsent(k, new ArrayList<>());
            hm.get(k).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}
