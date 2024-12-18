// Day 34 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/allocate-minimum-number-of-pages0937

class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
        int n = arr.length;
        if(k>n) return -1;
        int l=Integer.MIN_VALUE, h=0;
        for(int i=0; i<n; i++){
            l = Math.max(l, arr[i]);
            h = h+arr[i];
        }
        int res=h;
        while(l<=h){
            int mid = (l+h)/2;
            if(canAllocate(arr, mid, k)){
                res=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return res;
    }
    public static boolean canAllocate(int[] arr, int mid, int k){
        int st=1, pg=0;
        for(int i : arr){
            if(i > mid) return false;
            if(i+pg > mid){
                st++;
                pg=i;
                if(st>k) return false;
            }else{
                pg+=i;
            }
        }
        return true;
    }
}
