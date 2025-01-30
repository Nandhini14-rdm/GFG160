//   Day 77 / 160

//   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/recursion-and-backtracking-gfg-160/problem/n-queen-problem0315

class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        ArrayList<Integer> board = new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        //boolean row[] = new boolean[n];
        boolean col[] = new boolean[n];
        boolean sw[] = new boolean[2*n-1];
        boolean nw[] = new boolean[2*n-1];
        
        queensPlaced(0, n, board, col, sw, nw, res);
        
        return res;
    }
    
    public static void queensPlaced(int i, int n, ArrayList<Integer> board,
        boolean[] col, boolean[] sw, boolean[] nw, 
        ArrayList<ArrayList<Integer>> res){
            
            if(i==n){
                res.add(new ArrayList<>(board));
                return;
            }
            
            
            for(int j=0; j<n; j++){
                if(!col[j] && !sw[i+j] && !nw[j-i+n-1]){
                    col[j] = true;
                    sw[i+j] = true;
                    nw[j-i+n-1] = true;
                    board.add(j+1);
                
                //board.add(j+1);
                
                    queensPlaced(i+1, n, board, col, sw, nw, res);
                
                    board.remove(board.size()-1);
                
                    col[j] = false;
                    sw[i+j] = false;
                    nw[j-i+n-1] = false;
                }
            }
        }
    
}
