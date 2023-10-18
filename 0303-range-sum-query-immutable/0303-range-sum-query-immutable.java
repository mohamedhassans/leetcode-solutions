class NumArray {
    int[] pre;
    int n;

    public NumArray(int[] nums) {

        
        n=nums.length;
        int pre[]=new int[n+1];
        for(int i=1;i<=n;i++)
            pre[i]=pre[i-1]+nums[i-1];
       this.pre=pre;
        
    }
    
    public int sumRange(int left, int right) {
        //System.out.println(Arrays.toString(pre));
        return pre[right+1]-pre[left];




        
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */