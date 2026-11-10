class Solution {
    public String minWindow(String s, String t) {
        if (t.length() == 0) return "";
        
        HashMap<Character, Integer> ht = new HashMap<>();
        HashMap<Character, Integer> hs = new HashMap<>();
        for (char c : t.toCharArray()) {
            ht.put(c, ht.getOrDefault(c, 0) + 1);
            hs.put(c, 0);
        }
        
        int need = ht.size(); // Keep need as ht.size()
        int avai = 0;
        int[] res = {0, 0, Integer.MAX_VALUE}; // Start minLen at MAX_VALUE
        int left = 0, right = 0;

        while (right < s.length()) {
            // 1. Expand right
            char rChar = s.charAt(right);
            if (hs.containsKey(rChar)) {
                hs.put(rChar, hs.get(rChar) + 1);
                if (hs.get(rChar).equals(ht.get(rChar))) {
                    avai++;
                }
            }
            right++;

            // 2. Shrink left whenever valid (even if right just hit s.length()!)
            while (avai == need) {
                if (res[2] > right - left) {
                    res[0] = left;
                    res[1] = right;
                    res[2] = right - left;
                }
                char lChar = s.charAt(left);
                if (hs.containsKey(lChar)) {
                    int count = hs.get(lChar) - 1;
                    hs.put(lChar, count);
                    if (count < ht.get(lChar)) { // Strictly '<', not '!='
                        avai--;
                    }
                }
                left++;
            }
        }
        return res[2] == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1]);
    }
}