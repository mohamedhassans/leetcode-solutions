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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lowestCommonAncestorHelper(root,p.val,q.val);
    }
    public TreeNode lowestCommonAncestorHelper(TreeNode root, int p, int q) {
        if(p<root.val&&q<root.val) return lowestCommonAncestorHelper(root.left,p,q);
        else if (p>root.val&&q>root.val) return lowestCommonAncestorHelper(root.right,p,q);
        else return root;

        
    }
}