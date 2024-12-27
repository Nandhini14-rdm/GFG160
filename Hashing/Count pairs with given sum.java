// Day 43 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/count-pairs-with-given-sum--150253


class Solution {

    int countPairs(int arr[], int target) {
        // Your code here
        Map<Integer, Integer> map = new HashMap<>();
        int c=0;
        for(int i=0; i<arr.length; i++){
            int rem = target - arr[i];
            if(map.containsKey(rem)){
                c+=map.get(rem);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return c;
    }
}
