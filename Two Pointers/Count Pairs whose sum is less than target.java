//   Day 52 / 160

//   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/count-pairs-whose-sum-is-less-than-target

class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int l=0, r=arr.length-1, cnt=0;
        while(l<r){
            if(arr[l]+arr[r]<target){
                cnt += (r-l);
                l++;
            }else r--;
        }
        return cnt;
    }
}
