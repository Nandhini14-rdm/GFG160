//  Day 20 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/check-if-strings-are-rotations-of-each-other-or-not-1587115620

class Solution {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        if(s1.length()!=s2.length()) return false;
        String concat = s1+s1;
        return subStrKmp(concat, s2);
    }
    public static boolean subStrKmp(String concat, String s2){
        int n = concat.length() , m = s2.length();
        int lps[] = buildLPS(s2);
        int i=0, j=0;
        while(i<n){
            if(concat.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            }
            if(j==m) return true;
            else if(i<n && concat.charAt(i)!=s2.charAt(j)){
                if(j!=0) j = lps[j-1];
                else i++;
            }
        }
        return false;
    }
    public static int[] buildLPS(String s){
        int n = s.length();
        int lps[] = new int[n];
        int i=1, len=0;
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len!=0){
                    len = lps[len-1];
                }else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
