class Solution {
    public String minWindow(String s, String t) {
        int ns=s.length();
        int nt=t.length();
        // HashMap<Character,Integer> mapt=new HashMap<>();
        // HashMap<Character,Integer> maps=new HashMap<>();
        int mapt[]=new int [2*26+10];
        int maps[]=new int [2*26+10];


        for(int j=0;j<nt;j++){
            char i=t.charAt(j);
          mapt[i-'A']++;
        }      
        int l=0;
        int r=0;
         int fl=0;
        int fr=0;
        int cnt=nt;
        
        while(l<ns&&r<ns)  {
            int ch=s.charAt(r)-'A';
            int valt=mapt[ch];
            int valss=maps[ch];
            if(valt!=0){
                if(valss<valt){
                    cnt--;
                 }
                 maps[ch]++;
               // maps.put(ch,valss+1);
                r++;
                
            }
            else{
                r++;
            }
             
            System.out.println("maps "+maps);
             System.out.println("cnt "+cnt);
             System.out.println(l+ "  "+r);
            if(cnt==0){
                    int chl=s.charAt(l)-'A';
                    while(cnt==0){
                        chl=s.charAt(l)-'A';
                        int vals=maps[chl];
                        if(fr==0&&fl==0) {fr=r;fl=l;}
                        else{
                            if(fr-fl>r-l){fr=r;fl=l;}
                        }
                         if(vals!=0){
                             maps[chl]--;
                               if((--vals)<mapt[chl]){
                                 cnt++;
                                 }
                         }
                           l++;
                      }
     
        }
             
                } 
                    
                
        return fl==fr&&fl==0?"":s.substring(fl,fr);
    }
}
