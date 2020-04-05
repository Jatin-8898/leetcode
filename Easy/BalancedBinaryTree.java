public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class Solution {
  
  public boolean isBalanced(TreeNode root) {
      int left;
      int right;
      
      if(root == null)
          return true;
      
      left = height(root.left);
      right = height(root.right);
      
      if(Math.abs(left-right) <=1 && isBalanced(root.left) && isBalanced(root.right))
          return true;
      
      return false;
  }
  
  int height(TreeNode node) 
  { 
      /* base case tree is empty */
      if (node == null) 
          return 0; 

      /* If tree is not empty then height = 1 + max of left 
       height and right heights */
      return 1 + Math.max(height(node.left), height(node.right)); 
  } 
}