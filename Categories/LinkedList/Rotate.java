import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode current = head;
        
        while (current != null) {   //EG 1 2 3 4 5 
            stack.push(current);
            current = current.next;
        }
        
        int rotations = stack.size() == 0  ?    0   :    k % stack.size();
        
        for (int i = 0; i < rotations; i++) {   //eg k is 2 so 0,1
        
            ListNode node = stack.pop();        //5 is popped           //Now 4 is popped
            ListNode last = stack.peek();       //4 ->next = NULL       //Now3->next = NUL
            
            last.next = null;
            node.next = head;
            head = node;            //LL is 5 1 2 3 4 ->NULL            //LL is 4 5 1 2 3 ->NULL
        }
        return head;
    }
}