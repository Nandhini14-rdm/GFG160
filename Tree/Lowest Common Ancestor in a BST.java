//    Day 93 / 160

//    https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/lowest-common-ancestor-in-a-bst

class Solution {
    Node LCA(Node root, Node n1, Node n2) {
        // your code here.
        while(root!=null){
            if(root.data<n1.data && root.data<n2.data){
                root = root.right;
            }
            else if(root.data>n1.data && root.data>n2.data){
                root = root.left;
            }
            else break;
        }
        return root;
    }
}
