//  Day 59 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/trapping-rain-water-1587115621

class Solution {
    public int maxWater(int arr[]) {
        // code here
        int l=0, r=arr.length-1, rmax=0, lmax=0, tot=0;
        while(l<=r){
            if(arr[l]<=arr[r]){
                if(arr[l]<lmax){
                    tot+=(lmax-arr[l]);
                }else{
                    lmax = arr[l];
                }
                l++;
            }else{
                if(arr[r]<rmax){
                    tot+=(rmax-arr[r]);
                }else{
                    rmax = arr[r];
                }
                r--;
            }
        }
        return tot;
    }
}
