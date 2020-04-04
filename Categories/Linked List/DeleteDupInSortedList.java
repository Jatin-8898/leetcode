
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class DeleteDupInSortedList {
    
    public ListNode deleteDuplicates(ListNode head) {   //Eg 1 2 2 3 4 4  return 1 2 3 4
        ListNode current = head;
    
        while (current != null && current.next != null) {
            
            if (current.next.val == current.val) {   //Simply Skip it.
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    
        return head;
    }
}