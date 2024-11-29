//  Day 15 / 160

// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/add-binary-strings3805

class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        s1 = s1.replaceFirst("^0+(?!$)","");
        s2 = s2.replaceFirst("^0+(?!$)","");
        int i=s1.length()-1, j=s2.length()-1, carry=0;
        StringBuilder res = new StringBuilder();
        while(i>=0 || j>=0 || carry!=0){
            int b1 = (i>=0)?s1.charAt(i)-'0':0;
            int b2 = (j>=0)?s2.charAt(j)-'0':0;
            int sum = b1+b2+carry;
            res.append(sum%2);
            carry = sum/2;
            i--;
            j--;
        }
        return res.reverse().toString();
    }
}
