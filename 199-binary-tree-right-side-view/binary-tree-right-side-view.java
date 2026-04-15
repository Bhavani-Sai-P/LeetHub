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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        traversal(root, 0, ans);
        return ans;
    }
    public void traversal(TreeNode node, int depth, List<Integer> ans){
        if(node==null) return;
        if(depth==ans.size()) ans.add(node.val);
        traversal(node.right, depth + 1, ans);
        traversal(node.left, depth + 1, ans);
    }
}