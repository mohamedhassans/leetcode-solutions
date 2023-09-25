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
    static HashMap<Integer,ArrayList<Integer>> map;
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans=new ArrayList<>();
        map=new HashMap<>(); 
        solve(root,0);  
        for(Map.Entry<Integer,ArrayList<Integer>> e:map.entrySet()) 
            ans.add(e.getValue());
        
        return ans;     
        
    }
    public static void solve(TreeNode r,int depth){
        if(r==null) return;
         
        solve(r.left,depth+1);
        if(!map.containsKey(depth))
               map.put(depth,new ArrayList<>());
            map.get(depth).add(r.val);
             

        solve(r.right,depth+1);
        


    }



}