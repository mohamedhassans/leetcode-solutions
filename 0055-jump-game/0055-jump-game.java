class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        boolean ans =true;
        for(int i=n-2;i>=0;i--){
            if(nums[i]!=0) continue;
            else{
                int j=i-1;
                int c=0;
                for(;j>=0;j-- ){
                    c++;
                    if(nums[j]>c){
                        break;
                    }
                    
                }
                if(j==-1)  ans=false;
                i=j+1;

            }

        }

        return ans;
        
    }
}