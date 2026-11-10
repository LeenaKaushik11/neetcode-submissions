class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        Set<Character> hs = new HashSet<>();
        int res=0;
        while(right < s.length()) {
            char c = s.charAt(right);
            if(hs.contains(c)) {
                res= Math.max(res,hs.size());
                while(hs.contains(c)) {
                hs.remove(s.charAt(left));
                left++;
                }}
            hs.add(s.charAt(right));
            right++;
        }
        res= Math.max(res,hs.size());
        return res;
        //acbdab
    }
}
