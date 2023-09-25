class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;

        int ans=-1;
        boolean jumbed=false;
        int left=nums[0];
        while(l<=r){
            int mid=(r+l)>>1;
            int cur=nums[mid];
            if(cur>=left){

                l=mid+1;
            }
            else{
                ans=mid;
                r=mid-1;
            }

        }

//         System.out.println(nums[r]) ;

if(l==0&&ans==-1) return nums[1];

 else if(r==nums.length-1) 
    return nums[0];
 else 
    return nums[ans];
 
    }
}