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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ele=new ArrayList<>();
        addEle(root,ele);
        Collections.sort(ele);
        return ele.get(k-1);

    }
    private void addEle(TreeNode node,List<Integer> list){
        if(node==null)return;
        list.add(node.val);
        addEle(node.left,list);
        addEle(node.right,list);
    }
}