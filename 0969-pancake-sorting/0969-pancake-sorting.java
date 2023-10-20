class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        int n=arr.length;
        List<Integer> ans=new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            if(arr[i]!=i+1){

               d: for(int j=i-1;j>=0;j--){

                    if(arr[j]==i+1){
                        int sizee=(j+1)/2;
                        ans.add(j+1);
                        for(int k=0;k<sizee;k++){
                            int temp=arr[k];
                            arr[k]=arr[j];
                            arr[j]=temp;
                            j--;
                        }
                        ans.add(i+1);
                        sizee=(i+1)/2; 
                        int tempi=i;
                        for(int k=0;k<sizee;k++){
                            int temp=arr[k];
                            arr[k]=arr[tempi];
                            arr[tempi]=temp;
                            tempi--;
                        }
                        break d;

                    }
                }

            }
             


        }
        
    return ans;
    }
}