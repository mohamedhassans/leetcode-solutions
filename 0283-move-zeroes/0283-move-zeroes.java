class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=1;
        while(l<n&&r<n) 
            if(nums[l]==0){
                if(r<l||nums[r]==0) 
                    r++;
 
                else{
                    nums[l]=nums[r];
                    nums[r]=0;
             }}
            else 
                l++;
             

         
        
    }
}