/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;      //If bth null then mirror
        
        if (t1 == null || t2 == null) return false;     //Either is null not a mirror
        
        return (t1.val == t2.val)       //If value is same && left==rght && right==left
            && isMirror(t1.right, t2.left)
            && isMirror(t1.left, t2.right);
    }
}