//  Day 58 / 160

// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/longest-distinct-characters-in-string5848

class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int maxi = 0, l=0, r=0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(r<s.length()){
            char curr = s.charAt(r);
            if(map.containsKey(curr) && map.get(curr)>=l){
                l=map.get(curr)+1;
            }
            map.put(curr, r);
            maxi = Math.max(maxi, r-l+1);
            r++;
        }
        return maxi;
        
    }
}
