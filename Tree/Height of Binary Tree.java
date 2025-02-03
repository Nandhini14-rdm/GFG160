//  Day 81 / 160

//   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/height-of-binary-tree

class Solution {
    // Function to find the height of a binary tree.
    int height(Node node) {
        // code here
        
        if(node==null) return -1;
        
        return Math.max(height(node.left), height(node.right))+1;
    }
}


