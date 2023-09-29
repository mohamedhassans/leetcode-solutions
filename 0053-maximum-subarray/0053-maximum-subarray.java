class Solution {
    static int[][] dp;
     static int max=-1000000010;
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxx=-1000000000;
        int cnt=0;
        for(int i:nums){
            if(i<0) cnt++;
            maxx=Math.max(i,maxx);
        }
        if(cnt==n) return maxx;
        dp=new int [100005][2];
        for(int []i:dp)
            Arrays.fill(i,-1000000010);
        int ans=Math.max(Math.max(maxx,solve(nums,0,0)),solve(nums,0,1));
        System.out.println(max);
        return ans;
        
    }
    public int solve(int[] nums,int i,int start){
        if (i == nums.length)
        return 0;
    if (dp[i][start] != -1000000010)
        return dp[i][start];

    int ans = -1000000010;

    if (start == 0) {
        int intializeStart = solve(nums, i + 1, 1 - start) + nums[i];
        int donnot = solve(nums, i + 1, start);
        max = Math.max(intializeStart, donnot);
        return dp[i][start] = Math.max(intializeStart, donnot);
    } else {
        int intializeStart = solve(nums, i + 1, start) + nums[i];
        int startNew = nums[i]; // Start a new subarray from the current element
        max = Math.max(max, Math.max(intializeStart, startNew));
        return dp[i][start] = Math.max(intializeStart, startNew);
    }
         

        //return dp[i]=Math.max(take,leave);

    }
}