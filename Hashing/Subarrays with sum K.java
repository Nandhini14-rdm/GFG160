//  Day 49 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/subarrays-with-sum-k

class Solution {
    public int countSubarrays(int arr[], int k) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0, c=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                c+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return c;
    }
}
