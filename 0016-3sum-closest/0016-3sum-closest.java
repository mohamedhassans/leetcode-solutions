class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;

        int sum=Integer.MAX_VALUE;
        int finall=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    int sum1=nums[i]+nums[j]+nums[k];
                    if(Math.abs(sum1-target)<Math.abs(sum-target)){
                        finall=sum1;
                        sum=sum1;

                    }
            
        }
            
        }

        }
        return finall;
        
    }
}