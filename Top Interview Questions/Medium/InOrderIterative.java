import java.util.*;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
 
class InOrderIterative {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode curr = root;
        
        while (curr != null || !stack.isEmpty())        // L V R
        {
            while(curr != null)
            {
                stack.push(curr);       //Push all the left nodes in the stack
                curr = curr.left;
            }
            
            //When node is null but stack has elements keep Popping
            curr = stack.pop();
            list.add(curr.val);             //Store it in List
            curr = curr.right;
        }
        
        return list;                //Finally return list
    }
}