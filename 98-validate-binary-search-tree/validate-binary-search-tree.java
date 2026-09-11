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
    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean valid(TreeNode node ,Long left,Long right){
        if (node ==null){
            return true;
        }
        if(!(left<node.val && node.val<right)){
            return false;
        }
        return valid(node.left,(long)left,(long)node.val)&&valid(node.right,(long)node.val,(long)right);
    }
}