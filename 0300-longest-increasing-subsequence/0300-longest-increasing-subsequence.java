class Solution {
    public int lengthOfLIS(int[] nums) {

        int dp[][]=new int [2502][2502];
        for(int[] i:dp) Arrays.fill(i,-1);

int ans=solve(dp,nums,0,-1);
        return ans ;
        
    }
    public int solve(int dp[][],int []nums,int i,int j){
         int n=nums.length;
        if(n==i) return 0;
        if( dp[i][j+1]!=-1) return dp[i][j+1];

        
            int ans=0;
            if(j==-1){
                ans=Math.max(1+solve(dp,nums,i+1,i),solve(dp,nums,i+1,j));
            }

            else if(nums[j]<nums[i]){
                ans=Math.max(1+solve(dp,nums,i+1,i),solve(dp,nums,i+1,j));

            }
            else{
                ans=  solve(dp,nums,i+1,j) ;
            }
            return dp[i][j+1]=ans;

 


    }
}