// Day 32 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/k-th-element-of-two-sorted-array1317

class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n = a.length;
        int m = b.length;
        int c=0, i=0, j=0;
        int ans=-1;
        while(i<n && j<m){
            if(a[i]<b[j]) {
                ans=a[i];
                i++;
            }
            else{
                ans=b[j];
                j++;
            }
            c++;
            if(c==k) return ans;
            
        }
        while(i<n && c<k){
            ans=a[i];
            i++;
            c++;
            if(c==k) return ans;
            
        }
        while(j<m && c<k){
            ans=b[j];
            j++;
            c++;
            if(c==k) return ans;
        }
        return ans;
    }
}
