class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (true) {
            if (root.val > p.val && root.val > q.val) {
                root = root.left;
            } else if (root.val < p.val && root.val < q.val) {
                root = root.right;
            } else {
                break;
            }
        }
        return root;
    }
}
//O(N), O(1) 迭代

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val < q.val) return helper(root, p, q);
        else return helper(root, q, p);
    }
    private TreeNode helper(TreeNode root, TreeNode p, TreeNode q){
        if(p.val <= root.val && q.val >= root.val) return root;
        else if(root.val > p.val && root.val > q.val) return helper(root.left, p, q);
        else return helper(root.right, p, q);

    }
}
// O(N), O(N)
