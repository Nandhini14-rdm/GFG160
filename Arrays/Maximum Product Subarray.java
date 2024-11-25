// Day 11 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/maximum-product-subarray3604

class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int max_prod = arr[0];
        int curr_min = arr[0];
        int curr_max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<0){
                int tmp = curr_max;
                curr_max = curr_min;
                curr_min = tmp;
            }
            curr_min = Math.min(curr_min*arr[i] , arr[i]);
            curr_max = Math.max(curr_max*arr[i] , arr[i]);
            max_prod = Math.max(curr_max, max_prod);
        }
        return max_prod;
    }
}
