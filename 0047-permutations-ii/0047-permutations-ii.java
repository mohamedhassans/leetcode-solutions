class Solution {
    //    static List<List<Integer>> ans ;

       static HashSet<List<Integer>> ans ;
       static void calculate(int []nums,List<Integer> current, int mask,int n){

        if(current.size()==n){
            ans.add(new ArrayList<>(current));
            // System.out.println(ans);
            return;
        }


        for(int i=0;i<n;i++){
            if(((1<<i)&mask)==0){
                current.add(nums[i]);
                calculate(nums,current,mask|(1<<i),n);
                current.remove(current.size()-1);

            }

            // calculate(nums,current,mask,n);


        }



       }

    public List<List<Integer>> permuteUnique(int[] nums) {
        int n = nums.length;
        ans = new HashSet<>();

        List<Integer> current = new ArrayList<>();
        
        calculate(nums,current, 0,n);

         List<List<Integer>> finalAns=new ArrayList<>();
         for(List<Integer> f:ans){
            finalAns.add(f);
         }

        return finalAns;
        
    }
}