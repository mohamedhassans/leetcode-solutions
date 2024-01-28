class Solution {
     
    static int n;
    public int minimumXORSum(int[] nums1, int[] nums2) {
        n = nums1.length;
        int []dp = new int [(1 << n)];
        Arrays.fill(dp, -1);
        // System.out.println(solve(0,   nums1, nums2));

        return solve(0, nums1,nums2,dp); 
    }
   static int solve(  int mask, int[] nums1, int[] nums2,int dp[]) {
        int i=Integer.bitCount(mask);


        if (mask == (1 << nums1.length) - 1) return 0;
        if (dp [mask] != -1) return dp [mask];

        int ans = Integer.MAX_VALUE;

        for (int j = 0; j < nums1.length; j++) {
            
            if ((mask & (1 << j)) == 0) {
                ans = Math.min(ans, Math.abs(nums1[i] ^ nums2[j]) +
                        solve( mask + (1 << j), nums1, nums2,dp));
            }
        }
        return dp[mask]=ans;


    }
}