//  Day 68 / 160
 
//   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/merge-two-sorted-linked-lists

class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }


class Solution {
    Node sortedMerge(Node h1, Node h2) {
        // code here
        Node dummy = new Node(0);
        Node curr = dummy;
        while(h1!=null && h2!=null){
            if(h1.data<=h2.data){
                curr.next = h1;
                h1 = h1.next;
            }else{
                curr.next = h2;
                h2 = h2.next;
            }
            curr = curr.next;
        }
        if(h1!=null) curr.next = h1;
        if(h2!=null) curr.next = h2;
        return dummy.next;
    }
}
