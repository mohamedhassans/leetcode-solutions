class Solution {
    public int lengthOfLongestSubstring(String s) {
        

        int l=0;
        int r=0;
        int n=s.length();
        int ans=0;
        HashSet<Character> hs=new HashSet<>();
        while(l<n&&r<n){
            if(hs.contains(s.charAt(r))){

                while(s.charAt(l)!=s.charAt(r)) {
                    hs.remove(s.charAt(l));
                    l++;
                }
                l++;
                r++;


            }
            else{
                hs.add(s.charAt(r));
                r++;

            }
            ans=Math.max(r-l,ans);


        }
        return ans;
    }
}