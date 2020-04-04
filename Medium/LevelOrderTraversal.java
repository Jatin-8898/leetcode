import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<>();  
        
        if (root == null) return res;  
        
        Queue<TreeNode> queue = new LinkedList<>();  
        queue.add(root);  
        
        while (!queue.isEmpty()) {  
        
            List<Integer> level = new ArrayList<>();  
            int size = queue.size();  
            
            for (int i = 0; i < size; i++) {  
            
                TreeNode node = queue.poll();   //Returns & Del element from front
                level.add(node.val);            //Add to the List
                
                if (node.left != null) {  
                  queue.add(node.left);  
                }
                
                if (node.right != null) {  
                  queue.add(node.right);  
                }  
             }
            
            res.add(level);   
        }  
        return res;
    }


    /* ANOTHER METHOD USING DFS */
    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        levelHelper(res, root, 0);
        return res;
    }
    
    public void levelHelper(List<List<Integer>> res, TreeNode root, int height) {
        if (root == null) return;

        if (height >= res.size()) {
            res.add(new LinkedList<Integer>());
        }

        res.get(height).add(root.val);
        levelHelper(res, root.left, height+1);
        levelHelper(res, root.right, height+1);
    }
}