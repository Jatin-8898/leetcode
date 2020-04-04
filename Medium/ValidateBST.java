import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }
    
    private static boolean isValid(TreeNode root, TreeNode l, TreeNode r){
        if(root == null)    return true;
        
        if(l != null && root.val <= l.val     ||      r != null && root.val >= r.val)
            return false;
        
        return isValid(root.left, l, root) && isValid(root.right, root, r);
    }
}