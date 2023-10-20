class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs=new HashSet<>();
        boolean ans=false; 
        while(!hs.contains(n)){
             hs.add(n);
            int temp=0;
            while(n!=0){
                int cur=n%10;
                temp+=(cur*cur);
                n/=10;
            }
            if(temp==1) return true;
            n=temp;
            


        }
        return ans;
        
    }
}