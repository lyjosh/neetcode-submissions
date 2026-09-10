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
        List<Integer> res = new ArrayList<>();
        dfs(root,res);
        Collections.sort(res);
        return res.get(k-1);
    }

    private void dfs(TreeNode curr, List<Integer> arr){
        if(curr == null){
            return;
        }
        arr.add(curr.val);
        dfs(curr.left, arr);
        dfs(curr.right, arr);
    }
}
