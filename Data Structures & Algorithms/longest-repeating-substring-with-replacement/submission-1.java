class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        int l =0;
        int maxFreq =0;
        int ans =0;

        for(int r =0;r<s.length();r++){
            freq[s.charAt(r)-'A']++;
            maxFreq = Math.max(maxFreq,freq[s.charAt(r)-'A'] );

            int win = r-l+1;
            if(win-maxFreq>k){
                freq[s.charAt(l)-'A']--;
                l++;
            win = r-l+1;
            }
        ans= Math.max(ans, win);
        }
        return ans;
    }
}
