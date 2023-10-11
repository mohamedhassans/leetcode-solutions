class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int all9=0;
        for(int i:digits) all9=i==9?all9+1:all9;
        if(all9==n){
            int ans[]=new int [n+1];
            ans[0]=1;
            return ans;
        }
        else{
            int ans[]=new int[n];
            int c=0;
            int s1=1;
            for(int i=n-1;i>-1;i--){
                s1 =digits[i]+c+s1;
                ans[i]=s1%10;
                c=s1/10;


                s1=0;

            }
            return ans;

        
        }
        
    }
}