//  Day 41 / 160
 
//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/matrix-gfg-160/problem/set-matrix-zeroes

class Solution {
    public void setMatrixZeroes(int[][] mat) {
        
        int m=mat.length;
        int n=mat[0].length;
        int rows[] = new int[m];
        int cols[] = new int[n];
        Arrays.fill(rows, 1);
        Arrays.fill(cols, 1);
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]==0){
                    rows[i]=0;
                    cols[j]=0;
                }
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(rows[i]==0 || cols[j]==0){
                    mat[i][j]=0;
                }
            }
        }
    }
}
