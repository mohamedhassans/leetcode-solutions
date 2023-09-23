class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length;
        int newIntervals[][]=new int [n+1][2];
        newIntervals[0]=newInterval.clone();
        
        for(int i=1;i<n+1;i++){
             newIntervals[i]=intervals[i-1];
        }
        Arrays.sort(newIntervals,(a,b)->a[0]-b[0]);
        for(int[] i:newIntervals)
        System.out.println(Arrays.toString(i));


         int s=newIntervals[0][0];
        int e=newIntervals[0][1];
        ArrayList<int[]>ans=new ArrayList();

        for(int i=1;i<n+1;i++){
            if(e>=newIntervals[i][0]){
                e=Math.max(e,newIntervals[i][1]);
            }
            else{
                ans.add(new int[]{s ,e });
                s =newIntervals[i][0];
                e =newIntervals[i][1];
            }}
             ans.add(new int[]{s ,e });
             
        int[][]res=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        
        }
        return res;

       

        
    }
}