class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

       HashMap<Character, Character> mst = new HashMap<>();
               HashMap<Character, Character> mts = new HashMap<>();

        for (int i=0;i<s.length();i++ ){
           char a = s.charAt(i);
           char b = t.charAt(i);
           if(mst.containsKey(a)){
            if(mst.get(a)!=b) return false;
           }
           else {
            mst.put(a,b);
           }
            if(mts.containsKey(b)){
            if(mts.get(b)!=a) return false;
           }
           else {
            mts.put(b,a);
           }
           
        }
        return true;
    }
}