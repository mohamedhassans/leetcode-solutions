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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return solve(root,subRoot);


        
    }

    public boolean solve(TreeNode root, TreeNode subRoot){
        if(root==null) return false;

        if(root.val==subRoot.val){
            System.out.println(root.val+" "+subRoot.val);
            return solve1(root,subRoot)||solve( root.left, subRoot)||
                      solve( root.right, subRoot);

        }
        else{
            return solve( root.left, subRoot)||
                      solve( root.right, subRoot);
        }
    }
    public boolean solve1(TreeNode root, TreeNode subRoot){
        if(root==null||subRoot==null){
            if(root==subRoot) return true;
        
        else{
            return false;
        }
        }

        return root.val==subRoot.val&&
        solve1(root.left,subRoot.left)&&
        solve1(root.right,subRoot.right);
    }
}