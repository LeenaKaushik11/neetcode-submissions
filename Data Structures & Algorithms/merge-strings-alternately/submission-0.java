class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length() +word2.length();
        int l=0;
        int r=0;
        String res="";
        for(int i=0;i<n; i++){
            if(l==word1.length() || r==word2.length()) break;
            if(i%2==0 && l<word1.length()) { 
                res+=word1.charAt(l);
                l++;
            } else if(i%2!=0 && r<word2.length()) { 
                res+=word2.charAt(r);
                r++;
            }
        }
        if(l<word1.length()){
            res+=word1.substring(l);
        }
        if(r<word2.length()){
            res+=word2.substring(r);
        }
        return res;
    }
}