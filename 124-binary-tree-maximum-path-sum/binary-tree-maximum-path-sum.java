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
    int res=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return res;
    }
    private int maxSum(TreeNode temp){
        if (temp==null)return 0;
        int left=maxSum(temp.left);
        int right=maxSum(temp.right);
        int path=temp.val+Math.max(left,right);
        return Math.max(0,path);
    }
    private void dfs(TreeNode temp){
        if (temp==null)return;
        int left=maxSum(temp.left);
        int right=maxSum(temp.right);
        res=Math.max(res,temp.val+left+right);
        dfs(temp.left);
        dfs(temp.right);
    } 
}