class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; next = null;}
}
 
public class CycleII {
    public ListNode detectCycle(ListNode head) {
        
        if (head == null || head.next == null)  return null;
        
        ListNode fast = head, slow = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        
            if (slow == fast) {
                slow = head;
            
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                
                return slow;
            }
        }
        return null;
        
    }
}