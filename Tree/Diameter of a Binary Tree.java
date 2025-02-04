//   Day 82 / 160

//   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/diameter-of-binary-tree

class Solution {
    int maxd = 0;
    public int height(Node root) {
        // Your code here
        if(root==null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        maxd = Math.max(maxd , lh+rh);
        return 1+Math.max(lh, rh);
    }
    int diameter(Node root){
        height(root);
        return maxd;
    }
}
