// Day 50 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/count-subarray-with-given-xor

class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        long c=0;
        int p=0;
        for(int i=0; i<arr.length; i++){
            p = p^arr[i];
            if(map.containsKey(p^k)){
                c+=map.get(p^k);
            }
            map.put(p , map.getOrDefault(p, 0)+1);
        }
        return c;
    }
}
