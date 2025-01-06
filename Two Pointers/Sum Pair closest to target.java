//  Day 53 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/pair-in-array-whose-sum-is-closest-to-x1124

class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        int maxDiff = Integer.MIN_VALUE;
        int l=0, r=arr.length-1;
        ArrayList<Integer> list = new ArrayList<>();
        while(l<r){
            int sum = arr[l]+arr[r];
            int diff = Math.abs(target - sum);
            if(diff<minDiff || (diff==minDiff && 
            (arr[r]-arr[l] > maxDiff))){
                list.clear();
                list.add(arr[l]);
                list.add(arr[r]);
                minDiff = diff;
                maxDiff =Math.abs(arr[r]-arr[l]); 
            }
            if(sum<target){
                l++;
            }else{
                r--;
            }
        }
        return list;
        
    }
}
