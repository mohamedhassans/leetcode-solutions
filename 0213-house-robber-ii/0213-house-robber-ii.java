class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+5];
        if(nums.length==1) return nums[0];
        Arrays.fill(dp,-1);
        int solve=solve(nums,dp,0);
        Arrays.fill(dp,-1);
        int solve1=solve1(nums,dp,1);
        
        return Math.max(solve,solve1);
    
    }
    public int solve(int[] nums,int[] dp,int i) {
        if(i>=nums.length-1) return 0;
        if(dp[i]!=-1)  return dp[i];
        
        return dp[i]=Math.max(solve(nums,dp,i+1),
                             nums[i]+solve(nums,dp,i+2));

}
public int solve1(int[] nums,int[] dp,int i) {
        if(i>=nums.length) return 0;
        if(dp[i]!=-1)  return dp[i];
        
        return dp[i]=Math.max(solve1(nums,dp,i+1),
                             nums[i]+solve1(nums,dp,i+2));

}
}