import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class NextGreaterElement {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> A = new ArrayList<>();
        
        //Add all nodes in ArrayList
        for (ListNode node = head; node != null; node = node.next)
            A.add(node.val);
        
        
        int[] res = new int[A.size()];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < A.size(); ++i) {
        
            //While stack has something & value is greater than stack then store it in res
            while (!stack.isEmpty()  &&   A.get(i) > A.get(stack.peek())){
                res[stack.pop()] = A.get(i);
            }
            
            stack.push(i);  //Normally insert in stack
        }
        return res;
    }
}