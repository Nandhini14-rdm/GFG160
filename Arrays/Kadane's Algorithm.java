// Day 10/160

// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/kadanes-algorithm-1587115620


class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // Your code here
        int n = arr.length;
        int max=arr[0];
        int curr=arr[0];
        for(int i=1; i<n; i++){
            curr = Math.max(arr[i], curr+arr[i]);
            max = Math.max(max, curr);
        }
        return max;
    }
}
