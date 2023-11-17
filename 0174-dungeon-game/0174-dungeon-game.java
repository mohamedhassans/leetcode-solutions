class Solution {
    public int calculateMinimumHP(int[][] dungeon) {

        int n=dungeon.length;
        int m=dungeon[0].length;
        int dp[][]=new int [n][m];
        
        dp[n-1][m-1]=dungeon[n-1][m-1]<=0?Math.abs(dungeon[n-1][m-1])+1:1;
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(i==n-1&&j==m-1) continue;
                else if(i==n-1){
                    dp[i][j]=dp[i][j+1]-dungeon[i][j];
                }
                else if(j==m-1){
                    dp[i][j]=dp[i+1][j]-dungeon[i][j];
                    
                }
                else{
                    dp[i][j]=Math.min(dp[i+1][j],dp[i][j+1])-dungeon[i][j];
                }
                dp[i][j]=dp[i][j]<=0?1:dp[i][j];
            }
        }
        return dp[0][0];
        
    }
}