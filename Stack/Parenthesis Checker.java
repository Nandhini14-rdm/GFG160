//  Day 99 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/stack-gfg-160/problem/parenthesis-checker2744

class Solution {
    static boolean isBalanced(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='(') st.push(')');
            else if(ch=='[') st.push(']');
            else if(ch=='{') st.push('}');
            else{
                if(st.isEmpty() || st.pop()!=ch){
                    return false;
                }
            }
            
        }
        return st.isEmpty();
    }
}
