import java.util.*;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
class PostOrderIterative {
    public List<Integer> postorderTraversal(TreeNode root) {
        
        LinkedList<Integer> list = new LinkedList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();     //Faster than Stack
        TreeNode curr = root;
        
        while(!stack.isEmpty() || curr != null) {
            
            if(curr != null) {
                stack.push(curr);
                list.addFirst(curr.val);        // Reverse the process of preorder
                curr = curr.right;             // Reverse the process of preorder
            
            } else {
                TreeNode node = stack.pop();
                curr = node.left;           // Reverse the process of preorder
            }
        }
        
        return list;
    }
}