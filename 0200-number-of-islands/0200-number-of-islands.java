class Solution {
    static int []dx={-1,0,1,0};
    static int []dy={0,1,0,-1};
    static int n,m;
    static boolean[][]vis;

    public int numIslands(char[][] grid) {
          n=grid.length;
          m=grid[0].length;
        vis=new boolean[n][m];

        int ans=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j]&&grid[i][j]=='1'){
                    dfs(grid,i,j);
                    ans++;
                }
            }
        }
        return ans;
        
    }

    public static boolean cheak(char [][]grid,int i,int j){
        return i<n&&i>-1&&j<m&&j>-1&&grid[i][j]=='1';
    }

    static void dfs(char[][] grid,int i,int j){
        vis[i][j]=true;

        for(int k=0;k<4;k++){
            int nexti=dx[k]+i;
            int nextj=dy[k]+j;

            if(cheak(grid,nexti,nextj)&&!vis[nexti][nextj]){
                dfs(grid,nexti,nextj);
            }

        }


    }
}