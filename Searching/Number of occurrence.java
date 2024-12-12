//  Day 28 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/number-of-occurrence2259

class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int n=arr.length;
        int l=0, h=n-1, c=0;
        int f = first(arr, n, target);
        int e = last(arr, n, target);
        if(f==-1 || e==-1) return 0;
        return e-f+1;
    }
    public static int first(int arr[], int n, int target){
        int f=-1;
        int l=0, h=n-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]>=target){
                f=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return f;
    }
    public static int last(int arr[], int n, int target){
        int e=-1;
        int l=0, h=n-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]<=target){
                e=mid;
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return e;
    }
}
