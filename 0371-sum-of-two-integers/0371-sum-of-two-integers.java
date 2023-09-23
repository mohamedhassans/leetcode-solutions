class Solution {
    public int getSum(int a, int b) {
        int cary=0;
        int res=0;
        int i=0;
        while(a!=0||b!=0){
            int bita=(1&a);
            int bitb=(1&b);
            int c=0;
            if(bita==bitb&&bitb==1) c=2;
            else if (bita!=bitb) c=1;

            if(cary==0&&c==0){
                

            }
            else if(cary==0&&c==1){
res=res|(1<<i);
            }
             else if(cary==0&&c==2){
                 cary=1;

            }
            else if(cary==1&&c==0){
res=res|(1<<i);
cary=0;
            }
            else if(cary==1&&c==1){
 
cary=1;
            }
            else if(cary==1&&c==2){
res=res|(1<<i);
cary=1;
            }
             

            a>>>=1;
            b>>>=1;



            i++;
            System.out.println(res);


        }
        if(cary==1&&i<32){
        res=res|(1<<i);
        System.out.println(res);}

        return res;
        
    }
}