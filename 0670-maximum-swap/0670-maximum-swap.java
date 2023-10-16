class Solution {
    public int maximumSwap(int num) {
        String str=num+"";
        char[]arr=str.toCharArray();
        int n=arr.length;
       l: for(int i=0;i<n;i++){
            char cur=arr[i];
            int max=i;
             for(int j=i+1;j<n;j++){
                char nxtcur=arr[j];
                 if(nxtcur>=arr[max]){
                     max=j;
                 }}
             if(arr[max]>cur){
                    char temp=cur;
                    arr[i]=arr[max];
                    arr[max]=temp;
                    break l;

                }
        
        
        }
        String s="";
       for(int i=0;i<n;i++){
           s+=arr[i];
       }
        return Integer.parseInt(s);
        
    }
}