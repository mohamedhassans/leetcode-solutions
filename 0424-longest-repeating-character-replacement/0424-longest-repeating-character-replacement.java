class Solution {
    public int characterReplacement(String s, int k) {

        int n=s.length();
        int ans=0;
        int tempk=k;

        for(int ch=0;ch<26;ch++){

            int l=0;
            int r=0;
            k=tempk;
            

            while(l<n&&r<n){
                if(s.charAt(r)-'A'==ch){ 
                     ans=Math.max(ans,r-l+1);
                     r++;}
                else{
                    if(k>0){
                         ans=Math.max(ans,r-l+1);
                        k--;
                        r++;
                    }
                    else{
                         
                            
                        if(s.charAt(l)-'A'==ch){
                            l++;
                        }
                        else{
                             
                            l++;
                            r++;
                             

                        }


                    }
                }

            }  
            


        }
        return ans;


        
    }
}