//  Day 3/160

// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/reverse-an-array

class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        int first = 0, last = n-1;
        while(first<=last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }
}
