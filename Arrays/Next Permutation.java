//  Day 5/160

// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/next-permutation5226

class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
        int i = n-2;
        while(i>=0 && arr[i]>=arr[i+1]) i--;
        if(i>=0){
            int j=n-1;
            while(j>=0 && arr[j]<=arr[i]) j--;
            swap(arr, i, j);
        }
        reverse(arr, i+1, n-1);
    }
    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    void reverse(int[] arr, int start, int end){
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
