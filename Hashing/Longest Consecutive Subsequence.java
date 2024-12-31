//  Day 47 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/longest-consecutive-subsequence2449

class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        TreeSet<Integer> set = new TreeSet<>();
        for(int i : arr){
            set.add(i);
        }
        int maxLen=0, c=0, prev=Integer.MIN_VALUE;
        for(int i : set){
            if(i==prev+1) c++;
            else c=1;
            maxLen = Math.max(maxLen,c);
            prev=i;
        }
        return maxLen;
    }
}
