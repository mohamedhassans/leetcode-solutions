class Solution {
public:
    int findDuplicate(vector<int>& nums) {

    int n= nums.size();
    int l=0;
    int r=n-1;
    int ans=-1;
    while(l<=r){
        int mid=(l+r)/2;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(nums[i]<=mid)cnt++;
        }
        if(cnt<=mid){
            l=mid+1;
        }else{
            r=mid-1;
            ans=mid;
        }
    }
    return ans;



}
};