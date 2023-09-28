class Solution {
    static int []dx={0,1,0,-1};
    static int []dy={1,0,-1,-0};
    static int n,m;
    static boolean[][]vis;
    static List<Integer> ans;
    public static boolean check( int i,int j){
        return i<n&&i>-1&&j<m&&j>-1&&!vis[i][j];
    }
    static void dfs(int[][] matrix,int i,int j){
        if(!check(i,j)) return ;
        vis[i][j]=true;
        ans.add(matrix[i][j]);

        if(i<=j+1)
            dfs(matrix,i,j+1);
           

        for(int k=1;k<4;k++){
            int nexti=dx[k]+i;
            int nextj=dy[k]+j;

            if(check(nexti,nextj)){
                dfs(matrix,nexti,nextj);
            }
       
        }


    }
    public List<Integer> spiralOrder(int[][] matrix) {
         n=matrix.length;
          m=matrix[0].length;
        vis=new boolean[n][m];

          ans= new ArrayList<>() ;
          dfs(matrix,0,0);
          return ans;
    }

}