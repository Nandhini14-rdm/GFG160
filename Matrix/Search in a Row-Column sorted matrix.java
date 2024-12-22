//  Day 38 / 160

// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/matrix-gfg-160/problem/search-in-a-matrix17201720

class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        if (mat==null || mat.length==0 || mat[0].length==0) {
            return false;
        }
        int m = mat.length, n = mat[0].length;
        int r=0, c=n-1;
        while(r<m && c>=0){
            if(mat[r][c]==x) return true;
            if(mat[r][c]<x) r++;
            else if(mat[r][c]>x) c--;
        }
        return false;
    }
}
