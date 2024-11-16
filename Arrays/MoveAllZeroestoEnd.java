// Day 2/160
// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/move-all-zeroes-to-end-of-array0751

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int j=0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                arr[j] = arr[i];
                j++;
            }
        }
        while(j<n){
            arr[j] = 0;
            j++;
        }
    }
}
