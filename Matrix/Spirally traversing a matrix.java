//  Day 36 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/matrix-gfg-160/problem/spirally-traversing-a-matrix-1587115621

class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        // code here
        int m=mat.length, n=mat[0].length;
        ArrayList<Integer> list = new ArrayList<>();
        int t=0, b=m-1;
        int l=0, r=n-1;
        while(t<=b && l<=r){
            for(int i=l; i<=r; i++){
                list.add(mat[t][i]);
            }
            t++;
            for(int i=t; i<=b; i++){
                list.add(mat[i][r]);
            }
            r--;
            if(t<=b){
                for(int i=r; i>=l; i--){
                    list.add(mat[b][i]);
                }
                b--;
            }
            if(l<=r){
                for(int i=b; i>=t; i--){
                    list.add(mat[i][l]);
                }
                l++;
            }
        }
        return list;
    }
}
