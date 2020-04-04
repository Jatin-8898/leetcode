import java.util.*;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
 
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> res = inorder(root, new ArrayList<Integer>());
        return res.get(k - 1);      //coz Indexing starts at Zero thats y (k-1)
      }
    
    public ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return list;
    
        inorder(root.left, list);
        
        list.add(root.val);
        
        inorder(root.right, list);
        
        return list;
    }

  
}