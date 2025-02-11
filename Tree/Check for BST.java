//  Day 89 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/check-for-bst

class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        // code here.
        return check(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
    public static boolean check(Node root, int max, int min){
        if(root==null) return true;
        if(root.data<min || root.data>max) return false;
        return check(root.left, root.data-1, min) &&
                check(root.right, max, root.data+1);
    }
}
