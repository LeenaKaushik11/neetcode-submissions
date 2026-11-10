class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //windowSize= s1.length();

        if (s2.length() <s1.length()) return false;
        int[] freq = new int[26];
        for(char c: s1.toCharArray()) {
            freq[c-'a']++;
        }
        int left = 0, right =s1.length()-1;
        while (right < s2.length()) {
            int[] freq1 = new int[26];
            for(int i=left;i<=right;i++){
                freq1[s2.charAt(i)-'a']++;
            }
            //System.out.println(Arrays.toString(freq));
            //System.out.println("freq1" +Arrays.toString(freq1));
            if (Arrays.equals(freq, freq1)) return true;
            left++;
            right++;
        }
        return false;
    }
}
