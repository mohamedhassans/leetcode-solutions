class Solution {
public:
   int minKBitFlips(vector<int>& nums, int k) {
    int n = nums.size();
    vector<int> flips(n ,0);
    for(int i=0;i<n;i++){
        int curbit= nums[i];
        if(i>0){
            int prev=flips[i-1];
            int  before = i-k>=0?flips[i-k]:0;
            int total= prev-before;
            if(total%2==1)
                curbit^=1;
        }
        if(curbit==0){
            if(i+k>n)
                return -1;
            flips[i]=1;
        }
        if(i>0)
            flips[i]+=flips[i-1];
        nums[i]=1;
    }
    return flips[n-1];

}
};