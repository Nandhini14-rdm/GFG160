//  Day 69 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/add-two-numbers-represented-by-linked-lists

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution {
    static Node addTwoLists(Node num1, Node num2) {
        // code here
        Node ans = null;
        Node curr = null;
        int carry=0;
        Node n1 = trim(num1);
        Node n2 = trim(num2);
        n1 = rev(n1);
        n2 = rev(n2);
        while(n1!=null || n2!=null ||carry!=0){
            int c = carry;
            if(n1!=null){
                c+=n1.data;
                n1=n1.next;
            }
            if(n2!=null){
                c+=n2.data;
                n2 = n2.next;
            }
            Node nn = new Node(c%10);
            carry = c/10;
            if(ans==null){
                ans = nn;
                curr = nn;
            }else{
                curr.next = nn;
                curr = curr.next;
            }
        }
        return rev(ans);
    }
    public static Node rev(Node head){
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
    public static Node trim(Node head){
        while(head!=null && head.data==0){
            head = head.next;
        }
        return head;
    }
}
