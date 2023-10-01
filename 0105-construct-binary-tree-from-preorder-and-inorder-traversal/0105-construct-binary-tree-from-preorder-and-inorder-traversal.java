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
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        ArrayList<Integer> pre=new ArrayList<>();
        ArrayList<Integer> in=new ArrayList<>();
        for(int i=0;i<preorder.length;i++) 
            pre.add(preorder[i]) ;
        for(int i=0;i<inorder.length;i++) 
                 in.add(inorder[i]) ;

                 return build(pre,in);
      

        
    }

    public TreeNode build(ArrayList<Integer> pre,ArrayList<Integer> post){
        if(pre.size()==0||post.size()==0 ) return null;

        TreeNode root =new TreeNode(pre.get(0));
        int mid=post.indexOf(pre.get(0));
        root.left=build(new ArrayList<>(pre.subList(1, mid+1)),new ArrayList<>(post.subList(0, mid)));

        root.right=build(new ArrayList<>(pre.subList(mid+1,pre.size())),new ArrayList<>(post.subList(mid+1, post.size())));

        return root;

        



    }
}