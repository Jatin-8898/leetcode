/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x)  { val = x; }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
            
        if (t1 == null) return t2;      //if any of the tree node is null return other one
        if (t2 == null) return t1;

        TreeNode ans = new TreeNode(t1.val + t2.val);       //Add them
        
        ans.left = mergeTrees(t1.left, t2.left);        //Go left in both tree
        ans.right = mergeTrees(t1.right, t2.right);     //Go right in both
        
        return ans;
      
    }
}