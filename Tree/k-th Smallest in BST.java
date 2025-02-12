//    Day 90 / 160

//   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/find-k-th-smallest-element-in-bst

class Solution {
    // Return the Kth smallest element in the given BST
    public int kthSmallest(Node root, int k) {
        // Write your code here
        int[] cnt = {0};
        return helper(root, cnt, k);
    }
    public static int helper(Node root, int[] cnt, int k){
        if(root==null) return -1;
        int left = helper(root.left, cnt, k);
        if(left!=-1) return left;
        cnt[0]++;
        if(cnt[0]==k) return root.data;
        int right = helper(root.right, cnt, k);
        return right;
    }
}
