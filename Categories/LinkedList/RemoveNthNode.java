class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class RemoveNthNode {
 
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;        //eg 1 2 3 4 5   n=2 
       
        ListNode slow = newHead;
        ListNode fast = newHead;
        
        while(n > 0){           //fast is at 2
            fast = fast.next;
            n--;
        }
        
        while(fast.next != null){     //Now slow is at 3
            fast = fast.next;
            slow = slow.next;
        }
 
        slow.next = slow.next.next;     //Skip this ie 4
        
        return newHead.next; // 1 2 3 5

    }
    
}