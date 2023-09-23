class Solution {
    static List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans=new ArrayList<>();
        find(candidates,0,target,new Stack<>());
        return ans;
    }
 public void find(int []arr,int i,int tar,Stack st){

     if(i==arr.length||tar<=0){
         if(tar==0) ans.add(new ArrayList<>(st));
         return;
     }

     st.push(arr[i]);
     find(arr,i,tar-arr[i],st);
     st.pop(); 
     find(arr,i+1,tar,st);




 }
}