// Day 1/160
//  https://www.geeksforgeeks.org/problems/second-largest3735/1

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }if(arr[i]<first && arr[i]>second){
                second = arr[i];
            }
        }
        return second!=Integer.MIN_VALUE ? second : -1;
    }
}
