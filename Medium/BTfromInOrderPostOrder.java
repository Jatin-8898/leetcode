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
    int pInorder;   // index of inorder array
    int pPostorder; // index of postorder array

    //inorder = [9,3,15,20,7]
    //postorder = [9,15,7,20,3]

    private TreeNode buildTree(int[] inorder, int[] postorder, TreeNode end) {
        if (pPostorder < 0) {       
            return null;
        }

        // create root node
        TreeNode root = new TreeNode(postorder[pPostorder--]);

        // if right node exist, create right subtree
        if (inorder[pInorder] != root.val) {
            root.right = buildTree(inorder, postorder, root);
        }

        pInorder--;

        // if left node exist, create left subtree
        if ((end == null) || (inorder[pInorder] != end.val)) {
            root.left = buildTree(inorder, postorder, end);
        }

        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        pInorder = inorder.length - 1;
        pPostorder = postorder.length - 1;

        return buildTree(inorder, postorder, null);
    }

    /*
    private int count = 0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
       int len = inorder.length;
       count = len-1;
       return buildTree(inorder, 0, len-1, postorder);
    }
   
    private TreeNode buildTree(int[] inorder, int iStart, int iEnd, int[] postorder) {
        
        if(iEnd < iStart || iStart < 0) return null;
        
        TreeNode root = new TreeNode(postorder[count]);
        count--;
        
        int index = -1;
        for(int i=iStart;  i<=iEnd; i++){
            if(inorder[i] == root.val) {
                index = i;
                break;
            }
        }
        root.right = buildTree(inorder, index+1, iEnd, postorder);
        root.left = buildTree(inorder, iStart, index-1, postorder);
       
        return root;
    }
    */
}