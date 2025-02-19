//  Day 97 / 160

//  https://www.geeksforgeeks.org/batch/gfg-160-problems/track/heap-gfg-160/problem/merge-k-sorted-linked-lists

class Solution {
    // Function to merge K sorted linked list.
    public static Node find(int start, int end, List<Node> arr){
        if(start==end) return arr.get(start);
        int mid = start + (end-start)/2;
        Node h1 = find(start, mid, arr);
        Node h2 = find(mid+1, end, arr);
        Node head = merge(h1, h2);
        return head;
    }
    
    public static Node merge(Node h1, Node h2){
        Node dummy = new Node(-1);
        Node curr = dummy;
        while(h1!=null && h2!=null){
            if(h1.data<=h2.data){
                curr.next =  h1;
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
    
    Node mergeKLists(List<Node> arr) {
        // Add your code here.
        if(arr.size()==0) return null;
        return find(0, arr.size()-1, arr);
    }
}
