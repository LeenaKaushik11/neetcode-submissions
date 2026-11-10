class Solution {
    public int numRescueBoats(int[] p, int limit) {
        int l=0;
        int r=p.length-1;
        int res=0;
        Arrays.sort(p);
        while(l<=r){
            res+=1;
            System.out.println(l+" "+r);
            if(p[l]+p[r]<=limit) {
                System.out.println("here ");
                 l++;
                 r--;
            } else {
                r--;
            }
        }
        return res;
    }
}