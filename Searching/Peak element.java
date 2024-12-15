//  Day 31 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/peak-element

class Solution {

    public int peakElement(int[] arr) {
        // code here
        int n = arr.length;
        if(n==1 || arr[0]>arr[1]) return 0;
        if(arr[n-1]>arr[n-2]) return n-1;
        int l=1, h=n-2;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]) return mid;
            if(arr[mid]<arr[mid+1]){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return 0;
    }
}
