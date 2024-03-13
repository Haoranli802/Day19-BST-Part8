class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val == key){
            if(root.left == null && root.right == null) return null;
            else if(root.left != null && root.right == null) return root.left;
            else if(root.right != null && root.left == null) return root.right;
            else{
                TreeNode cur = root.right;
                while(cur.left != null) cur = cur.left;
                cur.left = root.left;
                return root.right;
            }
        }
        else if(root.val > key){
            root.left = deleteNode(root.left, key);
            return root;
        }
        else{
            root.right = deleteNode(root.right, key);
            return
        }
    }
}
// O(N), O(N) 递归

class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode cur = root;
        TreeNode pre = null;
        while(cur != null){
            if(cur.val > key){
                pre = cur;
                cur = cur.left;
            }
            else if(cur.val < key){
                pre = cur;
                cur = cur.right;
            }
            else{
                break;
            }
        }
        if(cur == null) return root;
        if(pre == null){
            return delete(cur);
        }
        else if(pre.left == cur){
            pre.left = delete(cur);
        }
        else{
            pre.right = delete(cur);
        }
        return root;
    }
    public TreeNode delete(TreeNode node){
        if (node == null){
            return null;
        }
        if (node.right == null){
            return node.left;
        }
        if(node.left == null){
            return node.right;
        }
        TreeNode cur = node.right;
        while (cur.left !=null){
            cur = cur.left;
        }
        cur.left = node.left;
        return node.right;
    }
}
//O(N), O(1) 迭代
