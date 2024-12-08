// Day 21 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/sorting-gfg-160/problem/sort-an-array-of-0s-1s-and-2s4231
 
class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int n = arr.length;
        int c0=0, c1=0, c2=0;
        for(int i : arr){
            if(i==0) c0++;
            else if(i==1) c1++;
            else c2++;
        }
        int i=0;
        while(i<c0){
            arr[i++]=0;
        }
        while(i<c0+c1){
            arr[i++]=1;
        }
        while(i<c0+c1+c2){
            arr[i++]=2;
        }
    }
}
