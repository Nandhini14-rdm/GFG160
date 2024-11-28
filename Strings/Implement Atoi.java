//  Day 14 / 160

// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/implement-atoi

class Solution {
    public int myAtoi(String s) {
        // Your code here
        int i = 0, n = s.length();
        long res = 0; boolean isNeg = false;
        
        while(i<n && s.charAt(i)==' ') i++;
        
        if(i<n){
            char sign = s.charAt(i);
            if(sign=='-') {isNeg = true; i++;}
            else if(sign=='+') {isNeg = false; i++;}
        }
        
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';
            res = res*10 + digit;
            if(res>Integer.MAX_VALUE) {
                return isNeg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            i++;
        }
        
        return isNeg ? (int)-res : (int) res;
    }
}
