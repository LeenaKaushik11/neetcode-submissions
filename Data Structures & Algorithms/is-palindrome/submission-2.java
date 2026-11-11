class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int l=0, r= s.length()-1;
        while(l<=r){
            System.out.println(isAlphaNum(s.charAt(l))+ " l "+s.charAt(l));
            System.out.println(isAlphaNum(s.charAt(r))+ " r "+ s.charAt(r));
            if(isAlphaNum(s.charAt(l)) && isAlphaNum(s.charAt(r)) && s.charAt(l)!=s.charAt(r)) {

                return false;
            } else if (!isAlphaNum(s.charAt(l))){
                l++;
                continue;
            } else if (!isAlphaNum(s.charAt(r))){
                r--;
                continue;
            }
           // System.out.println(l+ "l "+r +" r");
            l++;
            r--;
            //System.out.println(l+ "l "+r +" r");
        }
        return true;
    }

    boolean isAlphaNum(char c){
        return ((c>='a' && c<='z') || (c>='0' && c<='9'));
    }
}
