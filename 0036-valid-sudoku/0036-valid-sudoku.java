class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<String>  hs=new HashSet<>();
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char num=board[i][j];
                if(num!='.'){
                    
                    if(!hs.add(num+"i"+i)||
                       !hs.add(num+"j"+j)||
                       !hs.add(num+"b"+(i/3)+"-"+(j/3))
                      )
                        return false;
                    
                }
                System.out.println(hs);
            }
        }
        return true;
        
    }
}