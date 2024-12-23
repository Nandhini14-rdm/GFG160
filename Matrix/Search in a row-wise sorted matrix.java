// Day 39 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/matrix-gfg-160/problem/search-in-a-row-wise-sorted-matrix

class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        // code here
        int m=mat.length, n=mat[0].length;
        for(int i=0; i<m; i++){
            if(search(mat[i], x))
                return true;
        }
        return false;
    }
    public static boolean search(int[] arr, int x){
        int l=0, h=arr.length-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]==x) return true;
            if(arr[mid]<x) l=mid+1;
            else h=mid-1;
        }
        return false;
    }
}
