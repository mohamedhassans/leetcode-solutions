class Solution {
    public int uniquePaths(int m, int n) {
        
        int find[][]=new int [m][n];

        for(int i=0;i<n;i++){
            find[m-1][i]=1;
        }
        for(int i=0;i<m;i++){
            find[i][n-1]=1;
        }

        for(int i=m-2;i>-1;i--){
            for(int j=n-2;j>-1;j--){
                find[i][j]=find[i][j+1]+find[i+1][j];
            }
        }
        System.out.println(find[0][0]);
        return find[0][0];
    }
}