class Solution {
   static ArrayList<Integer>[]adj ;
    static boolean[] vis ;

        static int[] in ;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
int n=numCourses;
        adj=new ArrayList[n ];

        for (int i = 0; i < n  ; i++) {
                adj[i] = new ArrayList<>();
            }
          vis =new boolean[n ];

           in=new int [n ];

        for(int[]i:prerequisites){
int s=i[1];
int e=i[0];
adj[s].add(e);
in[e]++;

        }
 for(int i=0;i<n ;i++){
     if(!vis[i]&&in[i]==0) dfs(i);
 }
 System.out.println(Arrays.toString(in));

 int max=-1;
 for(int i:in) max=Math.max(max,i);

return max==0;


        
    }

    void dfs(int i){ 
        vis[i]=true;
        

        for(int k:adj[i]){
           
           in[k]--;
            if(in[k]==0)
                dfs(k);

        }


    }
}