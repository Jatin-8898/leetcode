class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode temp = head; 
  
        /* Traverse only till there are atleast 2 nodes left */
        while (temp != null && temp.next != null) { 
  
            int k = temp.val; 
            temp.val = temp.next.val; 
  
            temp.next.val = k; 
            temp = temp.next.next; 
        } 
        return head;
    }
}