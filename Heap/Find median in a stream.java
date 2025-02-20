//  Day 98 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/heap-gfg-160/problem/find-median-in-a-stream-1587115620

class Solution {
    public ArrayList<Double> getMedian(int[] arr) {
        // code here
        ArrayList<Double> res = new ArrayList<>();
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        for(int i : arr){
            if(pq1.isEmpty() || i<=pq1.peek()){
                pq1.add(i);
            }else{
                pq2.add(i);
            }
            if(pq1.size()>pq2.size()+1){
                pq2.add(pq1.poll());
            }else if(pq2.size()>pq1.size()){
                pq1.add(pq2.poll());
            }
            if(pq1.size()==pq2.size()){
                res.add((pq1.peek() + pq2.peek())/2.0);
            }else{
                res.add((double)pq1.peek());
            }
        }
        return res;
        
    }
}
