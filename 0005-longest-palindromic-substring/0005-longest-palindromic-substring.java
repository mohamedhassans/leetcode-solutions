class Solution {
    public String longestPalindrome(String s) {

        int fl=0;
        int fr=1;
        String finall=s.substring(fl,fr);
        int n=s.length();

        for(int i=0;i<n;i++){
            int l=i,r=i;

            for(;l>=0&&r<n&&s.charAt(l)==s.charAt(r);l--,r++)

            if(finall.length()<r-l+1){
                fl=l;
                fr=r;
                finall=s.substring(fl,fr+1);
            }
             l=i;r=i+1;

            for(;l>=0&&r<n&&s.charAt(l)==s.charAt(r)
            ;l--,r++)

            if(finall.length()<r-l+1){
                fl=l;
                fr=r;
                finall=s.substring(fl,fr+1);
            }

        }
        return finall;
        
        
    }
}