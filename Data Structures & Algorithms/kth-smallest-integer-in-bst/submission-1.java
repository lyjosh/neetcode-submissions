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
    List<Integer> sorted;
    public int kthSmallest(TreeNode root, int k) {
        this.sorted = new ArrayList<>();
        dfs(root);
        return sorted.get(k-1);
    }

    private void dfs (TreeNode root){
        if(root == null){
            return;
        }
        
        // Collections.sort(sorted);
        dfs(root.left);
        sorted.add(root.val);
        dfs(root.right);
    }
}
