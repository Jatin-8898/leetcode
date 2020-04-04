class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
 
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    
        ListNode p = l1, 
               q = l2, 
               head = null,
               temp = null;

        int carry = 0, 
           remainder = 0, 
           sum = 0;
       
        head = temp = new ListNode(0);
       
        while(p != null || q != null || carry != 0) {
       
            sum = (p != null ? p.val : 0) + (q != null ? q.val : 0) + carry;
            
            carry = sum / 10;
            
            remainder = sum % 10;
            
            temp = temp.next = new ListNode(remainder);
            
            p = (p != null ? p.next : null);
            q = (q != null ? q.next : null);
        }
        return head.next;
   }
}