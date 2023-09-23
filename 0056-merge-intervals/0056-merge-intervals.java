class Solution {
    public static int[][] merge(int[][] intervals) {
        ArrayList<int[]>ans=new ArrayList();
        int n=intervals.length;

        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
       
        for(int i=0;i<intervals.length;i++){
            System.out.println(Arrays.toString(intervals[i]));
        }
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]<=end){
                end=Math.max(end,intervals[i][1]);
            }
            else{
                ans.add(new int[]{start,end});
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }
        ans.add(new int[]{start,end});
        int[][]res=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        for(int i=0;i<res.length;i++){
            System.out.println(Arrays.toString(res[i]));
        }
        return res;
    }
}