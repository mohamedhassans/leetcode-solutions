/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null) return root;
        Queue<Node> q=new LinkedList<>();
        
        q.add(root);
        while(true){
            Queue<Node> q2=new LinkedList<>();
            while(!q.isEmpty()){
                Node cur=q.poll();
                if(q.isEmpty()){
                    if(cur.left!=null){
                        q2.add(cur.left);
                        q2.add(cur.right);
                    }

                }
                else{
                    cur.next=q.peek();
                    if(cur.left!=null){
                        q2.add(cur.left);
                        q2.add(cur.right);
                    }
                }
            }
            if(q2.isEmpty()) break; 
            q=q2;

        }
        return root;
        
    }
}