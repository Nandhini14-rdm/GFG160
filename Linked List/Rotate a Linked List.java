//  Day 67 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/rotate-a-linked-list

class Solution {
    public Node rotate(Node head, int k) {
        // add code here
        Node temp = head;
        int n=1;
        while(temp.next!=null){
            temp = temp.next;
            n++;
        }
        k=k%n;
        
        if(k==0) return head;
        temp.next = head;
        temp = head;
        for(int i=1; i<k; i++){
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}
