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
    private List<Integer> res;
    public List<Integer> rightSideView(TreeNode root) {
        this.res = new ArrayList<>();
        dfs(root, 0);
        return res;
    }

    private void dfs(TreeNode curr, int level){
        if(curr == null){
            return;
        }
        if(res.size() == level){
            res.add(curr.val);
        }
        dfs(curr.right, level + 1);
        dfs(curr.left, level + 1);

    }
}
