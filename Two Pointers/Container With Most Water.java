//  Day 60 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/container-with-most-water0535

class Solution {

    public int maxWater(int arr[]) {
        // Code Here
        int l=0, r=arr.length-1;
        int res=0;
        int water=0;
        while(l<=r){
            water = Math.min(arr[l], arr[r]) * (r-l);
            res = Math.max(res, water);
            if(arr[l]<arr[r]) l++;
            else r--;
        }
        return res;
    }
}
