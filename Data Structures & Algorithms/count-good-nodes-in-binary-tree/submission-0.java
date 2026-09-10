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
    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }

    private int dfs(TreeNode root, int maxSeen){
        if(root == null){
            return 0;
        }
        int newMax = Math.max(root.val, maxSeen);
        if(root.val >= maxSeen){
            return 1 + dfs(root.left,newMax) + dfs(root.right,newMax);
        } else {
            return dfs(root.left, newMax) + dfs(root.right,newMax);
        }
    }
}
