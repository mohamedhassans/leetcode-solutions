class Solution {
    public int missingNumber(int[] nums) {
        int mex=0;
        Arrays.sort(nums);
        for(int i:nums){
            if(mex!=i) return mex;
            mex++;
        }
        return mex;
        
    }
}