class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        // Frequency map for characters in t
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        int required = tMap.size(); // Number of unique chars we need to match
        int formed = 0;             // Number of unique chars currently matching required frequency
        
        HashMap<Character, Integer> windowCounts = new HashMap<>();
        
        // Answer tuple: {length, left, right}
        int[] ans = {-1, 0, 0};
        
        int left = 0, right = 0;
        
        while (right < s.length()) {
            char c = s.charAt(right);
            windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);
            
            // If the current character's frequency matches its required frequency in t, increment 'formed'
            if (tMap.containsKey(c) && windowCounts.get(c).intValue() == tMap.get(c).intValue()) {
                formed++;
            }
            
            // Try and contract the window till it ceases to be 'desirable'
            while (left <= right && formed == required) {
                char leftChar = s.charAt(left);
                
                // Save the smallest window until now
                if (ans[0] == -1 || (right - left + 1) < ans[0]) {
                    ans[0] = right - left + 1;
                    ans[1] = left;
                    ans[2] = right;
                }
                
                // The character at the position pointed by the `left` pointer is about to be discarded
                windowCounts.put(leftChar, windowCounts.get(leftChar) - 1);
                if (tMap.containsKey(leftChar) && windowCounts.get(leftChar).intValue() < tMap.get(leftChar).intValue()) {
                    formed--;
                }
                
                left++;
            }
            
            right++;
        }
        
        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }
}