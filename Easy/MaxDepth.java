class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int x) { 
        val = x; 
    }
}

class MaxDepth {
  
    public int maxDepth(TreeNode root) {
      
        if(root == null){
            return 0;
        }
        
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
            
        if(leftDepth > rightDepth)
            return leftDepth+1;
        else
            return rightDepth+1;
    }
}