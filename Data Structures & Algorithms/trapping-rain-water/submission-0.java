class Solution {
    public int trap(int[] height) {
        //find left greater
        //find right greater
        int sum =0;
        for(int i=0;i<height.length-1;i++){
            int leftmax= leftgreater(height,i);
            int rightmax= rightgreater(height,i);
            int ans = Math.min(leftmax,rightmax);
            if(ans>height[i]){
                sum =sum+ans-height[i];
            }

        }
return sum;

    }
    public int leftgreater(int[] height, int p){
        int n = height.length;
        int max =0;
        if(p==0){
            return 0;
        }
        for(int i=p-1;i>=0;i--){
            max=Math.max(max,height[i]);
        }
        return max;
    }
    public int  rightgreater(int[] height, int p){
        int n = height.length;
        int max =0;
        if(p==n-1){
            return 0;
        }
        for(int i=p+1;i<n;i++){
            max=Math.max(max,height[i]);
        }
        return max;
    }
}