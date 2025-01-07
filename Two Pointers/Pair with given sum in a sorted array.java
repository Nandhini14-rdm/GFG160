//  Day 54 / 160
 
//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/pair-with-given-sum-in-a-sorted-array4940

class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int c=0, n=arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            int rem = target - i;
            if(map.containsKey(rem)){
                c+=map.get(rem);
            }
            map.put(i, map.getOrDefault(i,0)+1);
        }
        return c;
    }
}
