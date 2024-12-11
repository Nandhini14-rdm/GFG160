//  Day 27 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/sorting-gfg-160/problem/merge-two-sorted-arrays-1587115620

class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n = a.length, m = b.length;
        int gap = (n+m+1)/2;
        while(gap>0){
            int i=0, j=gap;
            while(j<n){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                i++;
                j++;
            }
            j = (gap>n)?gap-n:0;
            while(i<n && j<m){
                if(a[i]>b[j]){
                    int temp = a[i];
                    a[i] = b[j];
                    b[j] = temp;
                }
                i++;
                j++;
            }
            i=0;
            while(j<m){
                if(b[i]>b[j]){
                    int temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
                i++;
                j++;
            }
            gap = (gap==1)?0:(gap+1)/2;
        }
        
    }
}
