class TrieNode{
    TrieNode[] arr;
    boolean flag;
    public TrieNode(){
        arr=new TrieNode[26];
        flag=false;
    }

    public void insert(TrieNode root,String word) {
        int n=word.length();
        TrieNode cur=root;

        for(int i=0;i<n;i++){
            int ch=word.charAt(i)-'a';
            if(cur.arr[ch]==null){
                cur.arr[ch]=new TrieNode();
            }
            cur= cur.arr[ch];
        }
        cur.flag=true;
        
    }

}


class Solution {
    static TrieNode root;
    HashSet<Pair> vis;
     HashSet<String> res;
     int n,m;

    public List<String> findWords(char[][] board, String[] words) {

        root=new TrieNode();
          n=board.length;
          m=board[0].length;

        for(String i:words) root.insert(root,i);
          vis=new HashSet<>();
          res=new HashSet<>();
          for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                dfs( board,i,j,root, "");

        return new ArrayList<>(res);
    }
    public void dfs(char[][] board,int r,int c,TrieNode node, String word ){
        if(r<0||c<0||r>=n||c>=m||node==null||node.arr[board[r][c]-'a']==null||vis.contains(new Pair(r,c))) 
            return ;

            vis.add(new Pair(r,c));
            node=node.arr[board[r][c]-'a'];
            word+=board[r][c];
            if(node.flag) res.add(word);

            dfs(board,r+1,c,node,word);
            dfs(board,r-1,c,node,word);
            dfs(board,r,c+1,node,word);
            dfs(board,r,c-1,node,word);



            vis.remove(new Pair(r,c));
        


    }
}