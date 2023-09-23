class Solution {
    public static void rotate(int[][] matrix) {
        for(int[]i:matrix){
            System.out.println(Arrays.toString(i));
        }
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < (n+1)/ 2; j++) {

                int temp=matrix[i][j];
                matrix[i][j]=matrix[n-1-j][i];
                matrix[n-1-j][i]=matrix[n-1-i][n-j-1];
                matrix[n-1-i][n-j-1]= matrix[j][n-i-1];
                matrix[j][n-i-1]=temp;




            }


            }
//        System.out.println("---------------");
//        for(int[]i:matrix){
//            System.out.println(Arrays.toString(i));
//        }

        }
}