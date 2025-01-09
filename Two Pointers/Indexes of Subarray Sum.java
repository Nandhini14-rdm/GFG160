//  Day 56 / 160

//   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/subarray-with-given-sum-1587115621

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int n=arr.length;
        int l=0,r=0, curr=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            curr+=arr[i];
            if(curr>=target){
                r=i;
                while(curr>target && l<r){
                    curr-=arr[l];
                    l++;
                }
                if(curr==target){
                    list.add(l+1);
                    list.add(r+1);
                    return list;
                }
            }
        }
        list.add(-1);
        return list;
    }
}
