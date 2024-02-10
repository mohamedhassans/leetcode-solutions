class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        int n=nums.size();
        vector<int> ans(n-k+1,0);
        set<pair<int,int>> s;
        for(int i=0;i<k;i++)
             s.insert({nums[i],i});
        ans[0]=s.rbegin()->first;
        for(int i=k;i<n;i++){
            s.erase({nums[i-k],i-k});
            s.insert({nums[i],i});
            ans[i-k+1]=s.rbegin()->first;
        }
        return ans;
        
    }
};