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
    public TreeNode invertTree(TreeNode root) {
        
        if(root == null)
            return null;
        
        TreeNode node = new TreeNode(root.val);
        
        node.left = invertTree(root.right);
        node.right = invertTree(root.left);
        
        return node;
    }
}