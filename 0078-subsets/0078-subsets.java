class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        int nn=(int)(Math.pow(2,n));
        List<List<Integer>>ans=new ArrayList<>();

        for(int i=0;i<nn;i++){
             ArrayList<Integer>temp=new ArrayList<>();
             for(int j=0;j<n;j++)
                if(((1<<j)&i)!=0)
                    temp.add(nums[j]);
                             
            ans.add(temp);

        }
        return ans;

        
    }
}