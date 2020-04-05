import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x;  next = null;}
}
public class IntersectionOfTwoLL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
         if(headA == null || headB == null) return null;
    
        ListNode a = headA;
        ListNode b = headB;

        //if a & b have different len, then we will stop the loop after second iteration
        while( a != b){
        
        //for the end of first iteration, we just reset the pointer to the head of another linkedlist
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;    
        }

        return a;
    }

    /* USING HASHSET */
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<ListNode>();
        
        while(headA!=null||headB!=null){
        
            if(headA != null) {
                if(set.contains(headA)) 
                    return headA;
                else   
                    set.add(headA);
                
                headA=headA.next;
            }
       
            if(headB != null) {
                if(set.contains(headB)) 
                    return headB;
                else   
                    set.add(headB);
                
                headB=headB.next;
            }
        }
        return null;
        
    }
}