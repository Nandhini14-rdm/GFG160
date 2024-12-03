// Day 19 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/minimum-characters-to-be-added-at-front-to-make-string-palindrome

class Solution {
    public static int minChar(String s) {
        // Write your code here
        String rev = new StringBuilder(s).reverse().toString();
        String comb = s + "#" + rev;
        int lps[] = computeLPS(comb);
        return s.length() - lps[comb.length()-1];
    }
    public static int[] computeLPS(String s){
        int n = s.length();
        int lps[] = new int[n];
        int len=0, i=1;
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len!=0){
                    len = lps[len-1];
                }
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
