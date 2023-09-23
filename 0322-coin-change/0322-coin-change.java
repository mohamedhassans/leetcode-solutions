class Solution {
    static int dp[][]=new int [13][10005];
    public int coinChange(int[] coins, int amount) {
        for(int []i:dp) Arrays.fill(i,-1);
        int ans=solve(coins,dp,0,amount);
        return ans>=1000000000?-1:ans;
        
    }

    static int  solve(int[] coins,int dp[][],int i,int amount){
        if(amount==0) return 0;
        if(i==coins.length||amount<0) return 1000000000;
        if(dp[i][amount]!=-1) return dp[i][amount];
        return dp[i][amount]=Math.min(1+solve(coins,dp,i,amount-coins[i]),solve(coins,dp,i+1,amount ));

    }
}