class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
    int n=nums.size();
    vector<int> ans(n-k+1,0);
    deque<int> curmax;
    for(int i=0;i<k;i++){
        while(!curmax.empty()&&nums[i]>curmax.back()){
            curmax.pop_back();
        }
        curmax.push_back(nums[i]);
    }
    ans[0]=curmax.front();
    for(int i=k ;i<n;i++){
        if(curmax.front()==nums[i-k]){
            curmax.pop_front();
        }
        while(!curmax.empty()&&nums[i]>curmax.back()){
            curmax.pop_back();
        }
        curmax.push_back(nums[i]);
        ans[i-k+1]=curmax.front();
    }
    return ans;

}
};