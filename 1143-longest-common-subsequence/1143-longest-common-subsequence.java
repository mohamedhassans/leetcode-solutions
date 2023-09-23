class Solution {
    static String s,t;
 	static int [][]dp;
 	public static int lcs(int i,int j) {
 		
 		if(i==s.length()||j==t.length()) return 0;
 		if(dp[i][j]!=-1) return dp[i][j];
 		
 		int ans=0;
 		if(s.charAt(i)==t.charAt(j)) 
 			ans=1+lcs(i+1, j+1);
 		else {
			ans=Math.max(lcs(i+1, j), lcs(i, j+1));
		}
 		
 		return dp[i][j]=ans;
 		
 	}
    public int longestCommonSubsequence(String text1, String text2) {
        s=text1;
 		t=text2;
 		dp=new int[1000][1000];
 		for (int [] d  : dp)
                Arrays.fill(d, -1);
 		  return lcs(0,0);
        
    }
}