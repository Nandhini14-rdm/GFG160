// Day 40 / 160

// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/matrix-gfg-160/problem/search-in-a-matrix-1587115621

class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int m = mat.length, n=mat[0].length;
        int l=0, h=m*n-1;
        while(l<=h){
            int mid = (l+h)/2;
            int row = mid/n;
            int col = mid%n;
            if(mat[row][col]==x) return true;
            else if(mat[row][col]<x) l=mid+1;
            else h=mid-1;
        }
        return false;
    }
}
