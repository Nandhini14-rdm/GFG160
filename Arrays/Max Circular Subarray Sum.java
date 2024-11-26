// Day 12 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/max-circular-subarray-sum-1587115620

class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {

        // Your code here
        int n = arr.length;
        int max = maxSub(arr, n);
        if(max<0) return max;
        int tot = sumOfEl(arr, n);
        int min = minSub(arr, n);
        int diff = tot - min;
        return Math.max(max, diff);
        
    }
    public static int maxSub(int[] arr, int n){
        int max_sub = arr[0];
        int curr_max = arr[0];
        for(int i=1; i<n; i++){
            curr_max = Math.max(arr[i] , curr_max+arr[i]);
            max_sub = Math.max(max_sub , curr_max);
        }
        return max_sub;
    }
    public static int sumOfEl(int[] arr, int n){
        int sum = 0;
        for(int i: arr){
            sum+=i;
        }
        return sum;
    }
    public static int minSub(int[] arr, int n){
        int min_sub = arr[0];
        int curr_min = arr[0];
        for(int i=1; i<n; i++){
            curr_min = Math.min(arr[i] , curr_min+arr[i]);
            min_sub = Math.min(min_sub, curr_min);
        }
        return min_sub;
    }
}
