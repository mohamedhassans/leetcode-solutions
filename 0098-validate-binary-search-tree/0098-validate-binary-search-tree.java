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
    public boolean isValidBST(TreeNode root) {

        return solve(root,null,null);
        
    }

    public boolean solve(TreeNode root,TreeNode min,TreeNode max){
        if(root==null) return true;

        if((min!=null&&root.val<=min.val)||(max!=null&&root.val>=max.val)){
            return false;
        }
        return solve(root.left,min,root)&&solve(root.right,root,max);

      
    }
}