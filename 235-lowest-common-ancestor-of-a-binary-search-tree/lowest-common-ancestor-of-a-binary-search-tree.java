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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if ((root.val>p.val &&root.val<q.val) ||(root.val<p.val &&root.val>q.val))return root;
        if(root.val==p.val ||root.val==q.val)return root;
        TreeNode left=(root.val>p.val&&root.val>q.val)?lowestCommonAncestor(root.left,p,q):null;
        TreeNode right=(root.val<p.val&&root.val<q.val)?lowestCommonAncestor(root.right,p,q):null;
        return left!=null?left:right;
    }
}