class Solution {
    public int maxArea(int[] height) {
        int n=height.length ;

        int l=0;
        int r=n-1;
        int ans=0;

        while(l<r ){

            int cur=(r-l)*(Math.min(height[r],height[l]));
            ans=Math.max(ans,cur);
            if(height[r]>height[l]){
                    l++;
            }
            else{
                   r--;
            }



        }
        return ans;
        
    }
}