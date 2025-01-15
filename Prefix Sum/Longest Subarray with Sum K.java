//   Day 62 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/prefix-sum-gfg-160/problem/longest-sub-array-with-sum-k0809


class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        int presum = 0, maxLen = 0;
        for(int i=0; i<arr.length; i++){
            presum+=arr[i];
            if(presum==k){
                maxLen = i+1;
            }
            if(map.containsKey(presum-k)){
                int curr = i - map.get(presum-k);
                maxLen = Math.max(maxLen , curr);
            }
            if(!map.containsKey(presum)){
                map.put(presum,i);
            }
        }
        return maxLen;
    }
}
