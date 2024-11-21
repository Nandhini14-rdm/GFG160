//  Day 7 /160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/stock-buy-and-sell2615

class Solution {
    public int maximumProfit(int arr[]) {
        // code here
        int n = arr.length;
        int cost = 0;
        for(int i=0; i<n-1; i++){
            if(arr[i+1]>arr[i]){
                cost = cost+arr[i+1]-arr[i];
            }
        }
        return cost;
    }
}
