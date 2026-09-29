/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> res=new ArrayList<>();
        dfsSer(root,res);
        return String.join(",",res);

    }

    private void dfsSer(TreeNode temp,List<String> res){
        if(temp==null){
            res.add("N");
            return ;
        }
        res.add(String.valueOf(temp.val));
        dfsSer(temp.left,res);
        dfsSer(temp.right,res);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] temp=data.split(",");
        int[] i={0};
        return dfsDes(temp,i);
    }
    private TreeNode dfsDes(String[] temp,int[] i){
        if(temp[i[0]].equals("N")){
            i[0]++;
            return null;
        }
        TreeNode node=new TreeNode(Integer.parseInt(temp[i[0]]));
        i[0]++;
        node.left=dfsDes(temp,i);
        node.right=dfsDes(temp,i);
        return node;
    }


}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));