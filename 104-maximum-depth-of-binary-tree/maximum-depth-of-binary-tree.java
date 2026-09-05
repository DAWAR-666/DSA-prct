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
    public int maxDepth(TreeNode root) {
        if (root==null)return 0;
        int depth=0;
        Queue <Pair<TreeNode,Integer>> q=new LinkedList <>();
        q.offer(new Pair<>(root,1));
        while(!q.isEmpty()){
            Pair<TreeNode,Integer> temp=q.poll();
            TreeNode node = temp.getKey();
            int len = temp.getValue();
            depth=Math.max(depth,temp.getValue());
            if(temp!=null){
                len++;
                if (node.left!=null)q.offer(new Pair<>(node.left,len));
                if(node.right!=null)q.offer(new Pair<>(node.right,len));
                
            }
            depth=Math.max(depth,temp.getValue());
        }
        return depth;
    }
}