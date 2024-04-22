class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String ans="";
        int n=strs.length;
        int minlen=300;
        for(String k:strs)
             minlen=Math.min(minlen,k.length());
        
        for(int j=0;j<minlen;j++){
            HashSet<Character> hs=new HashSet<>();
            
                for(int i=0;i<n;i++)
                    hs.add(strs[i].charAt(j));
            if(hs.size()!=1) break;
            ans+=strs[0].charAt(j);
                
        }
        return ans;
        
    }
}