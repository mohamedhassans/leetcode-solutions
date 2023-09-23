class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int [] arr=new int [n];
        int min=prices[0];
        arr[0]=0;
        for(int i=1;i<n;i++){
            min=Math.min(prices[i],min);
            arr[i]=prices[i]-min;
        }
        int max=arr[0];
        for(int i:arr) max=Math.max(max,i);
        return max;
    }
}