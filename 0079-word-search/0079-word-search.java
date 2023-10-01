class Solution {
    static HashSet<Integer> hs=new HashSet<>();
    static int n,m;
    static int dx[] = { -1, 0, 1, 0 };
    static int dy[] = { 0, 1, 0, -1};
    public boolean exist(char[][] board, String word) {
        hs=new HashSet<>();
        n=board.length;
        m=board[0].length;
        System.out.println(n+" "+m);
        boolean ans=false;

        for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){ 
               if(board[i][j]==word.charAt(0)){
                   //System.out.println("dsdsd");
                    hs=new HashSet<>();
                    hs.add(i*m+j);
                    ans|= solve(board, word, i, j,1) ;
               }
        }
     }
     return ans;
     }

    public boolean solve(char[][] board, String word,int i,int j,int idx) {
        if(idx==word.length()) return true; 
        boolean ans=false;
        for(int k=0;k<4;k++){
            int ni=i+dx[k];
            int nj=j+dy[k];
            if(ni<n&&ni>-1&&nj<m&&nj>-1&&word.charAt(idx)==board[ni][nj]&&!hs.contains(ni*m+nj)){
                hs.add(ni*m+nj);
             ans|=solve(board, word, ni, nj,idx+1) ;
             hs.remove(ni*m+nj);}


        
        }
        
    return ans;
    }
}