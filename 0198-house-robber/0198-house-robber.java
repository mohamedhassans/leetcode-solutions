import java.io.*;
import java.util.*;
class Solution {
    static Scanner sc = new Scanner(System.in);
	static PrintWriter pw = new PrintWriter(System.out);
    static int dp[]=new int [(int) 10e5];
    public int rob(int[] nums) {
        Arrays.fill(dp, -1);
        return helper(0,nums);
        
        
    }
    public static int helper(int i,int nums[]) {
    	   
    	  if(i>=nums.length)
    		  return 0;
    	  if(dp[i]!=-1)
    		  return dp[i];
    	  //int ans=0;
    	  return dp[i]=Math.max(nums[i]+helper(i+2, nums), helper(i+1, nums));
    	  
    	  
      }
}
