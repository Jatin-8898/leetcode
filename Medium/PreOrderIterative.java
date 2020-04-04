import java.util.*;

class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
}
         
class PreOrderIterative {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode curr = root;   // V L R
        
        while(curr != null) {
		    list.add(curr.val);     //Add the V into the list
		
            if (curr.right != null) {       //Store the right children in Stack
			    stack.push(curr.right);
            }
            
            curr = curr.left;       // 2nd step Move L nodes ahead
            
            if (curr == null && !stack.isEmpty()) {     //Finally print all the right nodes
                curr = stack.pop();
            }
	    }
        
        return list;                   
    }


    public List<Integer> preOrder2(TreeNode root){
        List<Integer> list = new LinkedList<Integer>();

        if(root==null) 
            return list;
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);           //put V in the stack
        
		while(!stack.empty()) {
        
            TreeNode curr = stack.pop();        
			list.add(curr.val);             //V in the List
        
            if(curr.right!=null)            //Put R in the stack
                stack.push(curr.right);
            
            if(curr.left!=null)             //Put L in stack
                stack.push(curr.left);
		}
        return list;
        

    }
}        