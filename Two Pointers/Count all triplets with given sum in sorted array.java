//  Day 51 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/count-all-triplets-with-given-sum-in-sorted-array

class Solution {
    public int countTriplets(int[] arr, int target) {
        // Code Here
        int n = arr.length, c=0;
        for(int i=0; i<n-2; i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum<target){
                    j++;
                }
                else if(sum>target){
                    k--;
                }
                else if(sum==target){
                    int e1=arr[j], e2=arr[k];
                    int c1=0,c2=0;
                    while(j<=k && arr[j]==e1){
                        j++;
                        c1++;
                    }
                    while(j<=k && arr[k]==e2){
                        k--;
                        c2++;
                    }
                    if(e1==e2){
                        c+=(c1*(c1-1))/2;
                    }
                    else{
                        c+=(c1*c2);
                    }
                }
            }
        }
        return c;
    }
}
