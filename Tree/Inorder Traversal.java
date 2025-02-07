//  Day 85 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/inorder-traversal

class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> list = new ArrayList<>();
        traversal(root, list);
        return list;
        
    }
    public static void traversal(Node root, ArrayList<Integer> list){
        if(root==null) return ;
        traversal(root.left, list);
        list.add(root.data);
        traversal(root.right, list);
    }
}
