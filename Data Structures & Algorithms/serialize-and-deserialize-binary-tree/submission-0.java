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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        List<String> values= new ArrayList<>();
        dfsSerialize(root, values);
        return String.join(",", values);

    }

    public void dfsSerialize(TreeNode node, List<String> values){
        if(node==null) {
            values.add("N");
            return;
        }

        values.add(String.valueOf(node.val));
        dfsSerialize(node.left, values);
        dfsSerialize(node.right, values);
    }
       

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] val=data.split(",");
        int i[]={0};
        return dfsDeserialize(i, val);  
    }

    public TreeNode dfsDeserialize(int[] i, String[] val){
        if(val[i[0]].equals("N")){
            i[0]++;
            return null;
        }

        TreeNode node=new TreeNode(Integer.parseInt(val[i[0]]));

        i[0]++;
        node.left = dfsDeserialize(i, val);
        node.right= dfsDeserialize(i, val);
        return node;
    }
}
