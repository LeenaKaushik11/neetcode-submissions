class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int l=0, r= s.length()-1;
        while(l<=r){
        while(l<=r && !isAlphaNum(s.charAt(l))){
            l++;}
        while(l<=r && !isAlphaNum(s.charAt(r))){
            r--;
            }
             System.out.println(l+ "l "+r +" r");    
            if(l<=r && s.charAt(l)!=s.charAt(r)) return false;
            
           // System.out.println(l+ "l "+r +" r");
            l++;
            r--;
        }
           // System.out.println(l+ "l "+r +" r");
        return true;
    }

    boolean isAlphaNum(char c){
        return ((c>='a' && c<='z') || (c>='0' && c<='9'));
    }
}
