// Day 25 / 160

//   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/sorting-gfg-160/problem/insert-interval-1666733333

class Solution {
    static ArrayList<int[]> insertInterval(int[][] arr, int[] newInterval) {
        // code here
        ArrayList<int[]> res = new ArrayList<>();
        int i=0, n=arr.length;
        while(i<n && arr[i][1]<newInterval[0]){
            res.add(arr[i]);
            i++;
        }
        while(i<n && arr[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0], arr[i][0]);
            newInterval[1]=Math.max(newInterval[1], arr[i][1]);
            i++;
        }
        res.add(newInterval);
        while(i<n){
            res.add(arr[i]);
            i++;
        }
        return res;
    }
}
