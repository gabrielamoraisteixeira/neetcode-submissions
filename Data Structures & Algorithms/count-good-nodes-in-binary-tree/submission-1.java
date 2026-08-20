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
    int count=0;
    public int goodNodes(TreeNode root) {

        return dfs(root, root.val);
        
    }

    private int dfs(TreeNode node, int value) {
        if(node == null) return 0;

        int count = 0;
        if (node.val >= value) count++;

        int newMax = Math.max(value, node.val);
        count += dfs(node.left, newMax);
        count += dfs(node.right, newMax);

        return count;
    }
}
