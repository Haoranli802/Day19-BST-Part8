class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        TreeNode temp = root;
        TreeNode pre = null;
        while(temp != null){
            pre = temp;
            if(temp.val > val) temp = temp.left;
            else temp = temp.right;
        }
        if(pre.val > val) pre.left = new TreeNode(val);
        else pre.right = new TreeNode(val);
        return root;
    }
}
//O(N), O(1) 迭代

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        if(root.val > val) root.left = insertIntoBST(root.left, val);
        else root.right = insertIntoBST(root.right, val);
        return root;
    }
}
//O(N), O(N) 递归
