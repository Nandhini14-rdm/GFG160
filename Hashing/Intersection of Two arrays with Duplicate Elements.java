//   Day 45 / 160

//   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/intersection-of-two-arrays-with-duplicate-elements

class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<a.length; i++){
            set.add(a[i]);
        }
        for(int i=0; i<b.length; i++){
            if(set.contains(b[i]) && !res.contains(b[i])){
                res.add(b[i]);
            }
        }
        return res;
        
    }
}
