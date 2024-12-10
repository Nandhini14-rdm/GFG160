//  Day 26 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/sorting-gfg-160/problem/non-overlapping-intervals

class Solution {
    static int minRemoval(int arr[][]) {
        // code here
        int c=0;
        Arrays.sort(arr, (a,b) -> Integer.compare(a[1], b[1]));
        int prev = Integer.MIN_VALUE;
        for(int[] a : arr){
            if(a[0]<prev) c++;
            else prev = a[1];
        }
        return c;
    }
}
