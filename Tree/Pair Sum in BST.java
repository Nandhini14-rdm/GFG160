//    Day 91 / 160

//    https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/find-a-pair-with-given-target-in-bst

class Solution {
    boolean findTarget(Node root, int target) {
        // Write your code here
        Set<Integer> set = new HashSet<>();
        return find(root, set, target);
    }
    private static boolean find(Node root, Set<Integer> set, 
        int target){
            if(root==null) return false;
            if(set.contains(target-root.data)) return true;
            set.add(root.data);
            return find(root.left, set, target)||find(root.right,
                set, target);
        }
}
