class Solution(object):
 def getAverages(self, nums, k):
    n = len(nums)
    ans = [-1] * n
    sum_val = sum(nums[i] for i in range(min(2*k+1, n)))

    range_size = 2*k+1
    for i in range(k, n-k):
        ans[i] = sum_val // range_size
        sum_val -= nums[i-k]
        if i+k+1 < n:
            sum_val += nums[i+k+1]
    return ans
        