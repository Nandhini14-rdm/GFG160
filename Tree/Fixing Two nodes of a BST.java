//  Day 92 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/fixed-two-nodes-of-a-bst

class Solution {
    void correctBST(Node root) {
        // code here.
        Node[] first = {null}, middle = {null}, last = {null},
        prev = {null};
        helper(root, first, middle, last, prev);
        if(first[0]!=null && last[0]!=null) {
            swap(first[0], last[0]);
        }
        else if(first[0]!=null && middle[0]!=null){
            swap(first[0], middle[0]);
        }
    }
    
    public static void helper(Node root, Node[] first, 
        Node[] middle, Node[] last, Node[] prev){
            
            if(root==null) return;
            helper(root.left, first, middle, last, prev);
            if(prev[0]!=null && root.data<prev[0].data){
                if(first[0]==null){
                    first[0] = prev[0];
                    middle[0] = root;
                }
                else{
                    last[0] = root;
                }
            }
            prev[0] = root;
            helper(root.right, first, middle, last, prev);
        }
    private static void swap(Node a, Node b){
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
    }
}
