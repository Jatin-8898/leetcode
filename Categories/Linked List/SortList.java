class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode sortList(ListNode head) {
        
        if (head == null || head.next == null) 
            return head;
        
        ListNode pre = null,  slow = head,  fast = head;
        
        while (fast != null && fast.next != null) {   // step 1. cut the list to two halves
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        pre.next = null;             // closing up;
    
        // step 2. sort each half
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        // step 3. merge l1 and l2
        return merge(l1, l2);
        
        
    }

    private ListNode merge(ListNode head1, ListNode head2) {
        ListNode newHead = new ListNode(0);
        ListNode tail = newHead;
    
        while (head1 != null || head2 != null) {
           
            if (head2 == null || (head1 != null && head1.val <= head2.val)) {
                tail.next = head1;      //If head2 null join tail.next to Head1
                head1 = head1.next;
            
            } else {
                tail.next = head2;      //else join it to Head2
                head2 = head2.next;
            }
            
            tail = tail.next;       //In both case tail will move 1 step ahead
        }
        return newHead.next;
    }
}