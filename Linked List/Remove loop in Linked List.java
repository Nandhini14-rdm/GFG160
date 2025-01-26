//  Day 73 / 160

//   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/remove-loop-in-linked-list


class Node
{
    int data;
    Node next;
}


class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(slow==fast){
            slow = head;
            if(slow!=fast){
                while(slow.next!=fast.next){
                    slow = slow.next;
                    fast = fast.next;
                }
                fast.next = null;
            }
            else{
                while(fast.next!=slow){
                    fast = fast.next;
                }
                fast.next = null;
            }
        }
    }
}
