// Day 87 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/maximum-path-sum-from-any-node

class Solution {
    // Function to return maximum path sum from any node in a tree.
    int findMaxSum(Node node) {
        // your code goes here
        int[] ans = {node.data};
        helper(node, ans);
        return ans[0];
    }
    private static int helper(Node node, int[] ans){
        if(node==null) return 0;
        int left = Math.max(0, helper(node.left, ans));
        int right = Math.max(0, helper(node.right, ans));
        ans[0] = Math.max(ans[0], left+right+node.data);
        return node.data+Math.max(left, right);
    }
}
