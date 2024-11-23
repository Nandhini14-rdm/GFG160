// Day 9/160

// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/minimize-the-heights3351

class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        int max = arr[n-1]-arr[0];
        int min = max;
        for(int i=0;i<n-1; i++){
            int maxVal = Math.max(arr[i]+k, arr[n-1]-k);
            int minVal = Math.min(arr[0]+k, arr[i+1]-k);
            if(minVal<0) continue;
            min = Math.min(min, maxVal-minVal);
        }
        return min;
        
    }
}

