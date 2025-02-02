//  Day 80 / 160

//   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/level-order-traversal


class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        if(root==null) return new ArrayList<>();
        
        Queue<Node> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        q.add(root);
        int level = 0;
        
        while(!q.isEmpty()){
            int n = q.size();
            res.add(new ArrayList<>());
            
            for(int i=0; i<n; i++){
                Node node = q.poll();
                res.get(level).add(node.data);
                
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            level++;
        }
        return res;
        
    }
}
