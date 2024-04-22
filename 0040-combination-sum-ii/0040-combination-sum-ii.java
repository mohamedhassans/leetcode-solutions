class Solution {
    static HashSet<List<Integer>> ans ;
    static int oo;
    
    static void calculate(int []nums,List<Integer> current, int val,int n,int idx){

        
        if(val==0){
            ArrayList<Integer> mm =new ArrayList<>(current);
            // Collections.sort(mm);
            ans.add(mm);
            // System.out.println(ans);
            return;
        }
        if(idx>=n) return;

        
        int prev=-1;

        for(int i=idx;i<n;i++){
            if(prev==nums[i]) continue;
            if(nums[i]<=val){
                current.add(nums[i]);
                calculate(nums,current,val-nums[i],n,i+1);
                prev=nums[i];
             current.remove(current.size()-1);
            }
        }
        // if(idx!=0&&nums[idx]!=nums[idx-1])
        //     calculate(nums,current,val,n,idx+1);
        
        // int m=idx+1;
        // for(int i=idx+1;i<n&&(i==0||nums[i]==nums[i-1]);i++){
        //     m=i;   
        // }
        // calculate(nums,new ArrayList<>(),oo,n,m );
            



       }

    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        oo=target;
        Arrays.sort(candidates);
        
        int n=candidates.length;
        List<Integer> current=new ArrayList<>();
        
        ans = new HashSet<>();
        
        
        calculate(candidates,current,target,n,0);
        
        
        List<List<Integer>> finalAns=new ArrayList<>();
         for(List<Integer> f:ans){
            finalAns.add(f);
         }

        // System.out.println(ans);
        return finalAns;
        
        
        
        
        
        
        
        
        
        
        
    }
}