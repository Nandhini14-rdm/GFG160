//  Dya 96 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/heap-gfg-160/problem/k-closest-points-to-origin--172242

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // Your code here
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> sq(b) - sq(a)
            );
            
        for(int[] point : points){
            if(pq.size()<k){
                pq.offer(point);
            }else{
                if(sq(point)<sq(pq.peek())){
                    pq.poll();
                    pq.offer(point);
                }
            }
        }
        
        int[][] res = new int[k][2];
        int j=0;
        while(!pq.isEmpty()){
            int[] p = pq.poll();
            res[j][0] = p[0];
            res[j][1] = p[1];
            j++;
        }
        return res;
    }
    
    public static int sq(int[] point){
        return point[0]*point[0]+point[1]*point[1];
    }
}
