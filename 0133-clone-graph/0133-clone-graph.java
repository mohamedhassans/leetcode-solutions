/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    static boolean[]vis;
    public Node cloneGraph(Node node) {
        HashMap<Integer,Node> mp=new HashMap<>();
        vis=new boolean[101];
        if(node==null) return null;
        dfs(node,mp);
        return mp.get(1);
 
        }
   
   
   
  

    public void dfs(Node root,HashMap<Integer,Node> mp){
        Node cur;
        vis[root.val]=true;
        if(mp.containsKey(root.val)){
                   cur=mp.get(root.val);
            }
            else{
                cur=new Node(root.val);
                mp.put(root.val,cur);
            }



        for(Node i:root.neighbors){

            Node newNode;
            if(mp.containsKey(i.val)){
                   newNode=mp.get(i.val);
                   cur.neighbors.add(newNode);
            }
            else{
                newNode=new Node(i.val);
                mp.put(i.val,newNode);
                cur.neighbors.add(newNode);
            }
            if(!vis[i.val]){
                dfs(i,mp);
            }





    }
} 
    }