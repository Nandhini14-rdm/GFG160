// Day 30 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/search-in-a-rotated-array4618

class Solution {
    int search(int[] arr, int key) {
        // Complete this function
        int n = arr.length;
        int l=0, h=n-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]==key) return mid;
            if(arr[l]<=arr[mid]){
                if(key>=arr[l] && key<arr[mid]){
                    h=mid-1;
                }else{
                    l=mid+1;
                }
            }else{
                if(key>arr[mid] && key<=arr[h]){
                    l=mid+1;
                }else{
                    h=mid-1;
                }
            }
        }
        return -1;
    }
}
