class Solution {
public:
    vector<int> getAverages(vector<int>& nums, int k) {
        int n=nums.size();
        vector<int>ans(n,-1);
        long long sum=0;
        for(int i=0;i<min(2*k+1,n);i++)
            sum+=nums[i];


        int rangeSize=2*k+1;
        for(int i=k;i<n-k;i++){
            ans[i]=(int)(sum/rangeSize);
            sum-=nums[i-k];
            if(i+k+1<n)
            sum+=nums[i+k+1];
        }
        return ans;
        
    }
};