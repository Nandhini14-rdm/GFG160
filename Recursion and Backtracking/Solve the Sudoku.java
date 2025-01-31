//  Day 78 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/recursion-and-backtracking-gfg-160/problem/solve-the-sudoku-1587115621

class Solution {
    // Function to find a solved Sudoku.
    static void solveSudoku(int[][] mat) {
        // code here
        int n = mat.length;
        int[] row = new int[n];
        int[] col = new int[n];
        int board[] = new int[n];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]!=0){
                    row[i]|=(1<<mat[i][j]);
                    col[j]|=(1<<mat[i][j]);
                    board[(i/3)*3 + j/3]|=(1<<mat[i][j]);
                }
            }
        }
        solve(mat, 0, 0, row, col, board);
    }
    
    public static boolean checksafe(int[][] mat, int i, int j, 
        int num, int[] row, int[] col, int[] board){
            if((row[i] & (1<<num))!=0 || (col[j] & (1<<num))!=0 ||
                (board[i/3*3 + j/3] & (1<<num))!=0) return false;
            return true;
    }
    
    public static boolean solve(int[][] mat, int i, int j, int[] row,
        int[] col, int[] board){
            int n = mat.length;
            if(i==n-1 && j==n) return true;
            if(j==n){
                i++; j=0;
            }
            if(mat[i][j]!=0) {
                return solve(mat, i, j+1, row, col, board);
            }
            for(int num=1; num<=n; num++){
                if(checksafe(mat, i, j, num, row, col, board)){
                    mat[i][j]=num;
                    row[i]|=(1<<num);
                    col[j]|=(1<<num);
                    board[i/3*3 + j/3] |= (1<<num);
                    
                    if(solve(mat, i, j+1, row, col, board)) return true;
                    mat[i][j] = 0;
                    row[i]&= ~(1<<num);
                    col[j]&= ~(1<<num);
                    board[i/3*3+j/3]&= ~(1<<num);
                }
            }
            return false;
        }
}
