// Day 55 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/count-possible-triangles-1587115620

class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        // code here
        int res=0;
        Arrays.sort(arr);
        for(int i=2; i<arr.length; i++){
            int l=0, r=i-1;
            while(l<r){
                if(arr[l]+arr[r] > arr[i]){
                    res+=(r-l);
                    r--;
                }else{
                    l++;
                }
            }
        }
        return res;
    }
}
