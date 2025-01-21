//  Day 69 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/reverse-a-linked-list-in-groups-of-given-size

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Solution {
    public static Node reverseKGroup(Node head, int k) {
        // code here
        if(head==null || k==1) return head;
        Stack<Node> st = new Stack<>();
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            int cnt=0;
            while(curr!=null && cnt<k){
                st.push(curr);
                curr = curr.next;
                cnt++;
            }
        
            while(!st.isEmpty()){
                if(prev==null){
                    prev = st.pop();
                    head = prev;
                }else{
                    prev.next = st.pop();
                    prev = prev.next;
                }
            }
        }
        prev.next = null;
        return head;
    }
}
