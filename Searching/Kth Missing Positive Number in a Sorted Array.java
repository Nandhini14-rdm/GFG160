//  Day 35 / 160

//   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/kth-missing-positive-number-in-a-sorted-array

class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int n=arr.length;
        int l=0, h=n-1;
        int res = n+k;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]>mid+k){
                res = mid+k;
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return res;
    }
}
