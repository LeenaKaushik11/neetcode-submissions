class Solution {
    public boolean validPalindrome(String s) {
        int i=0, j=s.length()-1;
        int chu=0;
        // main ides is ok i got 1 flaw.. i'll check if bacha hua from either side makes sense.. if yes..
        //if not then return false;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return isPalin(i+1,j,s) || isPalin(i,j-1,s);
            } else{
                i++;
                j--;
            }
        }
        return true;
    }

    public boolean isPalin(int i, int j, String s){
        while(i<j){
              if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}