import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class PallindromeNum {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        Stack<Integer> stack = new Stack<>();
        
        while (slow != null) {
            stack.push(slow.val);
            slow = slow.next;
        }
        
        while (head != null) {
            if (head.val != (int)stack.pop()) {
                return false;
            }
            head = head.next;
        }
        return true;
   }
}