//  Day 70 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/clone-a-linked-list-with-next-and-random-pointer

class Node {
    int data;
    Node next;
    Node random;

    Node(int x) {
        data = x;
        next = null;
        random = null;
    }
}

class Solution {
    public Node cloneLinkedList(Node head) {
        // code here
        Node curr = head;
        while(curr!=null){
            Node nn = new Node(curr.data);
            nn.next = curr.next;
            curr.next = nn;
            curr = nn.next;
        }
        curr = head;
        while(curr!=null){
            if(curr.random!=null){
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        curr = head;
        Node clonedHead = head.next;
        Node clone = clonedHead;
        while(clone.next!=null){
            curr.next = curr.next.next;
            clone.next = clone.next.next;
            curr = curr.next;
            clone = clone.next;
        }
        curr.next = null;
        clone.next = null;
        return clonedHead;
    }
}
