// Day  23 /160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/sorting-gfg-160/problem/inversion-of-array-1587115620

class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        int n = arr.length;
        int temp[] = new int[n];
        return mergeSortAndCnt(arr, temp, 0, n-1);
    }
    private static int mergeSortAndCnt(int[] arr, int[] temp, int left, int right){
        int c=0;
        if(left<right){
            int mid=(left+right)/2;
            c += mergeSortAndCnt(arr,temp,left,mid);
            c += mergeSortAndCnt(arr, temp, mid+1, right);
            c += mergeAndCnt(arr, temp, left, mid, right);
        }
        return c;
    }
    private static int mergeAndCnt(int[] arr, int[] temp, int left, int mid, int right){
        int i=left, j=mid+1, k=left, c=0;
        while(i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
                c += (mid-i+1);
            }
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=right){
            temp[k++] = arr[j++];
        }
        for(i=left; i<=right; i++){
            arr[i] = temp[i];
        }
        return c;
    }
}
