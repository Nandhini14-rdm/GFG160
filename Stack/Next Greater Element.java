// Day 101 / 160

// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/stack-gfg-160/problem/next-larger-element-1587115620

class Solution {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            list.add(-1);
        }
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                list.set(i, st.peek());
            }
            st.push(arr[i]);
        }
        return list;
    }
}
