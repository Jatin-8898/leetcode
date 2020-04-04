class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
 
class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        if (head != null) {
            
            ListNode odd = head;
            ListNode even = head.next;
            ListNode evenHead = even;

            while(even != null && even.next != null){
            
                odd.next = odd.next.next;   //Connected
                even.next = even.next.next; //Connected

                odd = odd.next;     //Move to the node connected
                even = even.next;     //Move to the node connected

            }

            //Finally on odd next place the even nodes
            odd.next = evenHead;
        }
        return head;
    }
}