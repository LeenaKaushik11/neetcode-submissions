class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        int ts = 0;
        for (int i : piles) {
            ts += i;
            r = Math.max(r, i);
        }
        //System.out.println("l : " + l + " r: " + r);
        while (l < r) {
            int mid = (l + r) / 2;
            double tim = 0;
            for (int i : piles) {
                tim += Math.ceil((double )i / mid);
                //System.out.println(Math.ceil(i / mid));
            }

           // System.out.println("tim : " + tim + " mid " + mid + " l " + l + " r " + r);
            if (tim <= h) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }
}
