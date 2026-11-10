public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];
        char[] se= s.toCharArray();
        char[] te = t.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            count[se[i] - 'a']++;
            count[te[i] - 'a']--;
        }

        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}