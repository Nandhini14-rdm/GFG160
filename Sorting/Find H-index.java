//  Day 22/160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/sorting-gfg-160/problem/find-h-index--165609

class Solution {
    // Function to find hIndex
    public int hIndex(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        for(int i=0; i<n; i++){
            int h = n-i;
            if(arr[i]>=h){
                return h;
            }
        }
        return 0;
    }
}
