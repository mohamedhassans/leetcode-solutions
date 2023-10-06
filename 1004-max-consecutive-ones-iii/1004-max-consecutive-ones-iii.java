class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int r=0;
        int n=nums.length;
        int ans=Integer.MIN_VALUE;
        while(r<n){
            if(nums[r]==1){
                r++;
            }
            else{
                if(k>0){
                    k--;
                    r++;

                }
                else{
                    if(nums[l]==1){
                        l++;
                    }
                    else{
                        l++;
                        r++;

                    }

                }
            }
            ans=Math.max(r-l,ans);
        }
        return ans;
        
    }
}