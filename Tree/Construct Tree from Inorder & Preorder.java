//    Day 84 / 160

//    https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/construct-tree-1

class Solution {
    public static Node buildTree(int inorder[], int preorder[]) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        int preIdx[] = {0};
        return solve(map, preorder, preIdx, 0, inorder.length-1);
    }
    public static Node solve(Map<Integer, Integer> map, int[] preorder,
        int[] preIdx, int left, int right){
            if(left>right) return null;
            int rootVal = preorder[preIdx[0]];
            preIdx[0]++;
            Node root = new Node(rootVal);
            int idx = map.get(rootVal);
            root.left = solve(map, preorder, preIdx, left, idx-1);
            root.right = solve(map, preorder, preIdx, idx+1, right);
            return root;
        }
}
