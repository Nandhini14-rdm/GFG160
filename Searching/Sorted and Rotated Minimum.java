// Day 29 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/minimum-element-in-a-sorted-and-rotated-array3611

class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        int n=arr.length;
        int l=0, h=n-1;
        while(l<h){
            int mid=(l+h)/2;
            if(arr[h]>=arr[mid]){
                h=mid;
            }else{
                l=mid+1;
            }
        }
        return arr[l];
    }
}
