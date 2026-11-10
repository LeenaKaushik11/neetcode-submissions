class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 1) {
            List<List<String>> res = new ArrayList<>();
            res.add(Arrays.asList(strs));
            return res;
        }

        HashMap<String,List<String>> hs= new HashMap<String,List<String>>();
        for(String s: strs){
            char[] te=s.toCharArray();
            Arrays.sort(te);
            String temp= new String(te);
            if(hs.containsKey(temp)) {
                List<String> ar= hs.get(temp);
                ar.add(s);
                hs.put(temp,ar);
                }
            else { 
                List<String> ar= new ArrayList();
                ar.add(s);
                hs.put(temp,ar);
            }
        }
        List<List<String>> res= new ArrayList<>();
        for(String s: hs.keySet()){
            res.add(hs.get(s));
        }
        return res;
    }
}
