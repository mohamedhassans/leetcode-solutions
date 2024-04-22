class Solution {
    static int dp[];
    static int inf=100000;
    static int solve(int i,int n,int[] nums){
        if(i>=n)
            return inf;
        if(i==n-1) return 0;
        if(dp[i]!=-1) return dp[i];
        
        int ans=inf;
        
        for(int j=i+1;j<=nums[i]+i;j++){
            
            ans=Math.min(ans,solve(j,n,nums)+1);
            
        }
        return dp[i]=ans;
        
    }
    public int jump(int[] nums) {
        int n = nums.length;
        dp=new int [10004];
        Arrays.fill(dp,-1);
        
        return solve(0,n,nums);
        
    }
}