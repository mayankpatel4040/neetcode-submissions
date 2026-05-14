class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
int max =0;
        int left =0;
        int freqMax= 0;
        int right =0;
        while(right<s.length()){
            freq[s.charAt(right)-'A']++;
            freqMax= Math.max(freqMax, freq[s.charAt(right)-'A']);
            while(right-left+1 - freqMax >k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
 max=Math.max(max, right-left+1);

            right++;

        }
        return max;
    }
}
