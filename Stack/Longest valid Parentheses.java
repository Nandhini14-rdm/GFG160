// Day 100 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/stack-gfg-160/problem/longest-valid-parentheses5657

class Solution {
    static int maxLength(String s) {
        // code here
        Stack<Integer> st = new Stack<>();
        int len=0;
        st.push(-1);
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='('){
                st.push(i);
            }
            else{
                st.pop();
                if(!st.isEmpty()) len = Math.max(len, i-st.peek());
                else st.push(i);
            }
        }
        return len;
    }
}
