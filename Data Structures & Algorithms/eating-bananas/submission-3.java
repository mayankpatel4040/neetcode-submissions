class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int r = Arrays.stream(piles).max().getAsInt();
        int l=1;
    int ans =r;
        while(l<=r){
            int mid = l+(r-l)/2;
            int total =0;
            for (int p: piles){
                total+= Math.ceil((double)p/mid);
            }
            if(total<=h){
                ans = Math.min(ans,mid);
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}
