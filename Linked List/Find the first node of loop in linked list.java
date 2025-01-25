//  Day 72 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/find-the-first-node-of-loop-in-linked-list--170645

class Node
{
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
}

class Solution {
    public static Node findFirstNode(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                slow = head;
                while(slow!=fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
