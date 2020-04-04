class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
 
class MergeTwoSortedLists {
    
    /* RECURSIVE METHOD */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		
        if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		
        } else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
    }


    
    /* ITERATIVE METHOD */
    public ListNode mergeTwoListsIterative(ListNode l1, ListNode l2) {
        
        if(l1 == null && l2 == null) return null;
        
        ListNode res = new ListNode(0);
        ListNode head = res;
        
        while(l1 != null || l2 != null){
            
            // if l2 reaches the end of list then increment only l1
            if(l2 == null) {
                res.next = l1;
                res = l1;
                l1 = l1.next;
            }
            
            // if l1 reaches the end of list then increment only l2
            else if(l1 == null){
                res.next = l2;
                res = l2;
                l2 = l2.next;
            }
            
            else if(l1.val < l2.val){
                res.next = l1;
                res = l1;
                l1 = l1.next;
            }
            
            // if l1.val >= l2.val
            else{       
                res.next = l2;
                res = l2;
                l2 = l2.next;
            }
        }
        return head.next;
    }

}