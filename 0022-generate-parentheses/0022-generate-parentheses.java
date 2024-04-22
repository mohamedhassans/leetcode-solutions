class Solution {
    
    static List<String> ans;
    
    static void  solve(int open,int remaining,String current){
        if(remaining==0){
            // System.out.println(current);
            if(open==0){
                ans.add(current);
            }
            return;
        }
        
        if(open>0){
            solve(open-1,remaining-1,current+")");
        }
        solve(open+1,remaining-1,current+"(");


        
    }
    
    
    public List<String> generateParenthesis(int n) {
        ans=new ArrayList<>();
        
        solve(0,2*n,"");
        
        return ans;
        
        
    }
}