class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int l = 0, r = nums[n-1];
        int ans=0;
        while(l<r){
            int mid=(l+r)/2;
            if(chk(nums,k,mid)){
                ans=mid;
                r=mid;


            }
            else{
                l=mid+1;
            }
        }
        return ans;
        
    }
    boolean chk(int nums[],int k,int mid){
        int cnt=0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n&&nums[j]-nums[i]<=mid;j++) cnt++;
        }
        return cnt>=k;

    }
}