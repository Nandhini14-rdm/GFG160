//   Day 86 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/boundary-traversal-of-binary-tree

class Solution {
    ArrayList<Integer> boundaryTraversal(Node node) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        if(node==null) return res;
        
        res.add(node.data);
        leftBoundary(node.left, res);
        leafNodes(node.left, res);
        leafNodes(node.right, res);
        rightBoundary(node.right, res);
        
        return res;
    }
    void leftBoundary(Node node, ArrayList<Integer> res){
        if(node!=null){
            if(node.left!=null){
                res.add(node.data);
                leftBoundary(node.left, res);
            }
            else if(node.right!=null){
                res.add(node.data);
                leftBoundary(node.right, res);
            }
        }
    }
    void rightBoundary(Node node, ArrayList<Integer> res){
        if(node!=null){
            if(node.right!=null){
                rightBoundary(node.right, res);
                res.add(node.data);
            }
            else if(node.left!=null){
                rightBoundary(node.left, res);
                res.add(node.data);
            }
        }
    }
    void leafNodes(Node node, ArrayList<Integer> res){
        if(node!=null){
            leafNodes(node.left, res);
            if(node.left==null && node.right==null){
                res.add(node.data);
            }
            leafNodes(node.right, res);
        }
    }
}
