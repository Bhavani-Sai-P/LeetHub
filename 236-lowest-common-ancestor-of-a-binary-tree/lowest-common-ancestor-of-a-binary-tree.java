/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode lca;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        traversal(root, p, q);
        return lca;
    }
    public int traversal(TreeNode curr, TreeNode p, TreeNode q) {
        int count = 0;
        if (curr == null) return 0;
        int ansOnLeft = traversal(curr.left, p, q);
        int ansOnRight = traversal(curr.right, p, q);
        if (curr == p || curr == q) count++;
        count = ansOnLeft + ansOnRight + count;
        if (count == 2 && lca == null) lca = curr;
        return count;
    }
}