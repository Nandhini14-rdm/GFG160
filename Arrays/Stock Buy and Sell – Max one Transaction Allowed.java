// Day 7/160

// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/buy-stock-2

class Solution {
    public int maximumProfit(int arr[]) {
        // Code here
        int min=arr[0];
        int cost=0;
        int n = arr.length;
        for(int i=1; i<n; i++){
            min = Math.min(min, arr[i]);
            cost =Math.max(cost, arr[i] - min);
        }
        return cost;
    }
}
