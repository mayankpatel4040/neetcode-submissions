
    class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sc = new String(c);
       map.putIfAbsent(sc, new ArrayList<>());

map.get(sc).add(s);



        }
        for(Map.Entry<String, List<String>> e: map.entrySet()){
            ans.add(e.getValue());
        }
        return ans;


    }
}

