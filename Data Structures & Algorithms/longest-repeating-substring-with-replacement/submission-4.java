class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> hm= new HashMap<>();
        int left =0;
        int maxlen=0, maxfreq=0;
        for (int right=0; right<s.length();right++) {
            hm.put(s.charAt(right), hm.getOrDefault(s.charAt(right),0)+1);
          //  System.out.println(hm.get(s.charAt(right)));
            maxfreq = Math.max(maxfreq, hm.get(s.charAt(right)));
            int val= (right-left+1) - maxfreq ;
            if((right-left+1) - maxfreq <= k) {
                maxlen =  Math.max(maxlen, right-left+1);
                 //System.out.println("maxlen" +maxlen);
            } else {
              //  System.out.println(left+" rihht" +right+ "val+ "+val+" maxfre "+maxfreq);
               // maxlen =  Math.max(maxlen, right-left+1);
                // System.out.println("maxleng" +maxlen);
                hm.put(s.charAt(left), hm.get(s.charAt(left))-1);
                left++;
            }
           
        }
        if (left ==0 ) maxlen = s.length();
        return maxlen;   
    }
}
