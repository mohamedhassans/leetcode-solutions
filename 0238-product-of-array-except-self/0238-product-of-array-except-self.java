class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int prod=1;
        int zeros=0;
        for(int i:nums) {
            if(i==0){
                zeros++;
                continue;
            }
            prod*=i;
        }

        int ans[]=new int [n];
        if(zeros>1) return ans;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                ans[i]=prod;
            }
            else{
                if(zeros==0) {
                   ans[i]=prod/nums[i]; 

                }
            }
        }
        return ans;
        
    }
}