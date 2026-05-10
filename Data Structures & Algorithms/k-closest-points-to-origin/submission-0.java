class Solution {
    public int[][] kClosest(int[][] points, int k) {
    
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> distance(b)-distance(a));
       for (int i =0; i< points.length;i++){
           pq.add(points[i]);
           if(pq.size()>k){
           pq.poll();
           }
        }
        int[][] result= new int[k][2];
        for(int i=0;i<k;i++){
            result[i]=pq.poll();
        }
        return result;
        

    }
    public int distance(int[] p){
            return p[0]*p[0] + p[1]*p[1];
        }
}
