class Solution {
    public boolean isAnagram(String s, String t) {
        //map because frequency store
        // then match those frequency
        // to create map o(n) 
        // traverse map o(n) again
        // edge case return if size not same..

        Map<Character,Integer> hm = new HashMap<Character, Integer>();
        Map<Character,Integer> ht = new HashMap<Character, Integer>();
        if(s.length() != t.length()) return false;
        for(char c: s.toCharArray()){
            hm.put(c, hm.getOrDefault(c,0)+1);
        }
        for(char c: t.toCharArray()){
            ht.put(c, ht.getOrDefault(c,0)+1);
        }

        for(char c: hm.keySet()){
            if (!hm.get(c).equals(ht.get(c))) return false;
        }
        return true;
    }

}
