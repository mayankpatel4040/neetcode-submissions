class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h = new HashSet<>();
        int l=0;
        int result =0;
     

        for(int r = 0 ; r<s.length() ; r++){
            while(h.contains(s.charAt(r))){
                h.remove(s.charAt(l));
                l++;
            }
            h.add(s.charAt(r));
            result= Math.max(result, r-l+1);
        }
return result;
    }
}
