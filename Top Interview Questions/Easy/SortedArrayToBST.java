class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class SortedArrayToBST {

    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        TreeNode head = sortedArrayToBST(nums);
        System.out.println(head.val);
        /*System.out.println(head.val);
        System.out.println(head.left.val);
        System.out.println(head.left.right.val);
        System.out.println(head.right.val);
        System.out.println(head.right.right.val);
        */
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) 
            return null;
            
        return buildBST(nums, 0, nums.length - 1);
    }
    
    public static  TreeNode buildBST(int[] nums, int start, int end) {
        if(start > end) 
            return null;

        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        
        root.left = buildBST(nums, start, mid - 1);
        root.right = buildBST(nums, mid + 1, end);
        
        return root;
    }
}