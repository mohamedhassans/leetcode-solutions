class Solution {
    static HashSet<List<Integer>> ans ;
    static int oo;
    
    static void calculate(int []nums,List<Integer> current, int val,int n,int idx){

        
        if(val==0){
            ArrayList<Integer> mm =new ArrayList<>(current);
             // Collections.sort(mm);
            ans.add(mm);
            
            return;
        }
        if(val<=0) return;

        
        int prev=-1;

        for(int i=idx;i<n;i++){
                if(prev==nums[i]) continue;
        
                current.add(nums[i]);
                calculate(nums,current,val-nums[i],n,i+1);
                current.remove(current.size()-1);
                prev=nums[i];
            
        }


       }

    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        oo=target;
        Arrays.sort(candidates);
        
        int n=candidates.length;
        List<Integer> current=new ArrayList<>();
        
        ans = new HashSet<>();
        
        System.out.println(Arrays.toString(candidates));
        
        
        calculate(candidates,current,target,n,0);
        
        
        List<List<Integer>> finalAns=new ArrayList<>();
         for(List<Integer> f:ans){
            finalAns.add(f);
         }

        // System.out.println(ans);
        return finalAns;
        
        
        
        
        
        
        
        
        
        
        
    }
}