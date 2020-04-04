class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Solution {
    public ListNode middleNode(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        while (fast != null) {
            slow = slow.next;
        
            if (fast.next == null) {
                fast = fast.next;
            
            } else {
                fast = fast.next.next;
            }
            
        }
        return slow;
    }
}