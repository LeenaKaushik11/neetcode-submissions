class Solution {
    public String longestCommonPrefix(String[] strs) {
        String low= strs[0];
        String res="";
        for(int i=0;i<low.length();i++){
            for(String s: strs){
                if(i== s.length() || s.charAt(i)!=low.charAt(i)){
                    return res;
                }
            }
            res+=low.charAt(i);
        }
        return res;
    }
}