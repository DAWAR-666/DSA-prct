/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        boolean value=(root.val==subRoot.val) ?isSameTree(root,subRoot):false;
        boolean left=root.left!=null?isSubtree(root.left,subRoot):false;
        boolean right=root.right!=null?isSubtree(root.right,subRoot):false;
        return left || right||value;
    }
    private boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null &&q!=null || q==null &&p!=null)return false;
        if(p==null&&q==null)return true;
        boolean left=isSameTree(p.left,q.left);
        boolean right=isSameTree(p.right,q.right);
        return left&&right&&(p.val==q.val);
    }
}