class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int val=nums[i];
            ans[i]=val*val;
        }
        Arrays.sort(ans);
        return ans;
        
    }
}