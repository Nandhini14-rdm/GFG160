// Day 6/160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/majority-vote

class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue()>(n/3)){
                res.add(e.getKey());
            }
        }
        return res;
    }
}
