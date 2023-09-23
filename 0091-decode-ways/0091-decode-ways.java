class Solution {
    public int numDecodings(String s) {

        int dp[]=new int [s.length()];
        if(s.charAt(0)=='0') return 0;
        else{
            dp[0]=s.charAt(0)!='0'?1:0;
            for(int i=1;i<s.length();i++){
                int  st=Integer.parseInt(s.charAt(i-1)+""+s.charAt(i));
                if(s.charAt(i)>'0'&&s.charAt(i)<='9')
                    dp[i]+=dp[i-1];
                 if(st>=10&&st<=26){
                if(i==1) 
                    dp[i]+=1;
                else
                     dp[i]+=dp[i-2];
                     }
            }
        }
        return dp[s.length()-1];
        
    }
}