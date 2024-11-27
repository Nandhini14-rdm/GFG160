//  Day 13 / 160

//   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/smallest-positive-missing-number-1587115621

class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        int c=1;
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0) continue;
            if(arr[i]==c) c++;
            else if(arr[i]>c) break;
        }
        return c;
    }
}
