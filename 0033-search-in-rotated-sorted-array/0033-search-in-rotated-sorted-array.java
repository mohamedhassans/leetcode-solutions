class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;

        int l=0;
        int r=n-1;
        int ans=0;
        while(l<=r){
            int mid=(l+r)>>1;
            if(nums[mid]==target){
                return mid;
            }
            
              if(nums[l]<=nums[mid]){
                if(target<nums[mid]&&nums[l]<=target)
                      r=mid-1;
                else
                     l=mid+1;
            }
            else{
 
                 if(nums[mid]<target&&target<=nums[r])
                     l=mid+1;
                else
                      r=mid-1;

            }

 
            System.out.println(nums[mid]);
            }
        return  -1;
        
    }

     
}