
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

/* Print only the Distinct Elements of LL */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {   //Eg 1 1 2 3 return 2 3
        
        //use two pointers, slow - track the node before the dup nodes, 
	    // fast - to find the last node of dups.
        ListNode temp = new ListNode(0), fast = head, slow = temp;
        
        slow.next = fast;
        while(fast != null) {
            
            while (fast.next != null  &&  fast.val == fast.next.val) {
                fast = fast.next; //while loop to find the last node of the dups.
            }
            
            if (slow.next != fast) { //duplicates detected.
                slow.next = fast.next; //remove the dups.
                fast = slow.next;     //reposition the fast pointer.
            
            } else {                //no dup, move down both pointer.
                slow = slow.next;
                fast = fast.next;
            }

        }
        return temp.next;
    }
}