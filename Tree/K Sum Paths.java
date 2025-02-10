//  Day 88 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/k-sum-paths

class Solution {
    public int sumK(Node root, int k) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        return count(root, k, 0, map);
    }
    public static int count(Node root, int k, int sum,
        HashMap<Integer,Integer> map){
            
            if(root==null) return 0;
            //int c=0;
            sum+=root.data;
            //if(sum==k) return c++;
            int c=map.getOrDefault(sum-k,0);
            map.put(sum, map.getOrDefault(sum,0)+1);
            c+=count(root.left, k, sum, map);
            c+=count(root.right, k, sum, map);
            map.put(sum, map.get(sum)-1);
            return c;
        }
}
