class Solution {
    public double myPowH(double x, long n) {
        if(x==1) return 1;
        if(n==0) return 1;
        if(x==0) return 0;
        if(n<0) {x=1/x; n*=-1;}  
        System.out.println(x+" "+n);
        
        
        double res=1.0;
        while(n>=1){
            if((n&1)==1)  res*=x;
            n/=2;
            x*=x;       
        
     }
     return res;

    }
    public double myPow(double x, int n) {
        return myPowH(x,1l*n);

  }}