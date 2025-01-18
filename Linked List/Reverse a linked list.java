//  Day 65 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/reverse-a-linked-list


class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

class Solution {
    Node reverseList(Node head) {
        // code here
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            Node curr = temp.next;
            temp.next = prev;
            prev = temp;
            temp = curr;
        }
        return prev;
    }
}
