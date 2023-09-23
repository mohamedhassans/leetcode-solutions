class Solution {
    public void setZeroes(int[][] matrix) {
        int [][]mat=new int [matrix.length][matrix[0].length];
          for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                mat[i][j]=matrix[i][j];
            }}
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(mat[i][j]==0){
                    for(int k=0;k<matrix[0].length;k++) 
                        matrix[i][k]=0;
                    for(int k=0;k<matrix.length;k++) 
                        matrix[k][j]=0;
                     
                }
            }
        }
        
    }
}