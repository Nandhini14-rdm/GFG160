//   Day 79 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/recursion-and-backtracking-gfg-160/problem/word-search

class Solution {
    static public boolean isWordExist(char[][] mat, String word) {
        // Code here
        int n = mat.length, m=mat[0].length;
        boolean visited[][] = new boolean[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mat[i][j]==word.charAt(0) && 
                    dfs(mat, i, j, word, 0, visited)){
                        return true;
                }
            }
        }
        return false;
    }
    
    public static boolean dfs(char[][] mat, int r, int c, String word,
        int idx, boolean[][] visited){
            if(idx==word.length()) return true;
            
            if(r<0 || r>=mat.length || c<0 || c>=mat[0].length){
                return false;
            }
            
            int[] dr = {-1, 1, 0, 0};
            int[] dc = {0, 0, -1, 1};
            
            for(int i=0; i<4; i++){
                int nr = r+dr[i];
                int nc = c+dc[i];
                if(dfs(mat, nr, nc, word, idx+1, visited)){
                    return true;
                }
            }
            visited[r][c] = false;
            return false;
        }
}
