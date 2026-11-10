class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs[0].length();
        for (int i= 0; i<n ;i++ ){
            for(String s: strs){
                if(i == s.length() || s.charAt(i) != strs[0].charAt(i)){
                    return s.substring(0,i);
                }
            }
        }
        return strs[0];

    }
}