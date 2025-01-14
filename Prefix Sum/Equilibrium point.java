//  Day 61 / 160
 
//   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/prefix-sum-gfg-160/problem/equilibrium-point-1587115620

class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int n = arr.length;
        int tot=0;
        for(int i=0; i<n; i++){
            tot+=arr[i];
        }
        int l=0;
        for(int i=0; i<n; i++){
            if(l==tot-l-arr[i]){
                return i;
            }
            l+=arr[i];
        }
        
        return -1;
    }
}
