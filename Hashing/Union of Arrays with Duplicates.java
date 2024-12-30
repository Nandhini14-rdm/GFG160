// Day 46 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/union-of-two-arrays3538

class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        Set<Integer> set = new HashSet<>();
        for(int i: a){
            set.add(i);
        }
        for(int j:b){
            set.add(j);
        }
        return set.size();
    }
}
