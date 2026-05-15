class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l =1;
        int max = Arrays.stream(piles).max().getAsInt();
        int r = max;
        while(l<=r){
            int k= l+(r-l)/2;
            int time =0;
            for (int p: piles){
                time+= Math.ceil((double)p/k);
            }
            if(time>h){
              
                l=k+1;

            }
            else {
               
                r=k-1;
            }
        }
        return l;
    }
}
