class Solution {
    public int maxProduct(int[] nums) {
    int n = nums.length;
    int[][] dp = new int[n][2];
    // dp[i][0] stores the maximum product ending at index i
    // dp[i][1] stores the minimum product ending at index i

    // Initialize the first element of dp
    dp[0][0] = nums[0];
    dp[0][1] = nums[0];

    int maxProduct = nums[0];

    for (int i = 1; i < n; i++) {
        if (nums[i] >= 0) {
            dp[i][0] = Math.max(nums[i], dp[i - 1][0] * nums[i]);
            dp[i][1] = Math.min(nums[i], dp[i - 1][1] * nums[i]);
        } else {
            dp[i][0] = Math.max(nums[i], dp[i - 1][1] * nums[i]);
            dp[i][1] = Math.min(nums[i], dp[i - 1][0] * nums[i]);
        }

        maxProduct = Math.max(maxProduct, dp[i][0]);
    }

    return maxProduct;
}
}