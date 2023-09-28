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
    static int res=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        res=Integer.MIN_VALUE;
        System.out.println(solve(root));
        return res;
        
    }
    public int solve(TreeNode p  ) {

        if(p==null) return 0;

        int m1=solve( p.left);
        int m2=solve( p.right);

        int max=Math.max(Math.max(m1,m2)+p.val,p.val);
        int maxrroot =Math.max(max,m1+m2+p.val);
        res=Math.max(res,maxrroot);
        return max;

    }
}