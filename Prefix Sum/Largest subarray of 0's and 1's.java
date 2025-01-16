// Day 63 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/prefix-sum-gfg-160/problem/largest-subarray-of-0s-and-1s

class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        Map<Integer, Integer> map = new HashMap<>();
        int presum=0, res=0;
        for(int i=0; i<arr.length; i++){
            int el = (arr[i]==0)?-1:1;
            presum+=el;
            if(presum==0){
                res = i+1;
            }
            if(map.containsKey(presum)){
                res = Math.max(res, i - map.get(presum));
            }
            else{
                map.put(presum, i);
            }
        }
        return res;
        
    }
}
