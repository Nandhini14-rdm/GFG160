// Day 33 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/aggressive-cows

class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        int n = stalls.length;
        Arrays.sort(stalls);
        int l=1, h=stalls[n-1]-stalls[0];
        int res=0;
        while(l<=h){
            int mid = (l+h)/2;
            if(canPlace(stalls, mid, k)){
                res=mid;
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return res;
    }
    private static boolean canPlace(int[] stalls, int mid, int k){
        int cowsPlaced=1, lastPos=stalls[0];
        for(int i=1; i<stalls.length; i++){
            if(stalls[i]-lastPos>=mid){
                cowsPlaced++;
                lastPos=stalls[i];
                if(cowsPlaced==k) return true;
            }
        }
        return false;
    }
}
