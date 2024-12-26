//  Day 42 / 160

//   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/key-pair5616

class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            int rem = target - arr[i];
            if(set.contains(rem)) return true;
            set.add(arr[i]);
        }
        return false;
    }
}
