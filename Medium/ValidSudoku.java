class Solution {
    public boolean isValidSudoku(char[][] board) {
       /* HashSet<Character> rows = new HashSet<Character>();
        HashSet<Character> columns = new HashSet<Character>();
        HashSet<Character> cube = new HashSet<Character>();
        
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
        
                if(board[i][j]!='.' && !rows.add(board[i][j]))
                    return false;
                
                if(board[j][i]!='.' && !columns.add(board[j][i]))
                    return false;
            
                int RowIndex = 3 * (i / 3); //Coz block size is 3 that's y  * 3
                int ColIndex = 3 * (i % 3);
                
                if(board[RowIndex + j/3][ColIndex + j%3]!='.' &&                                   !cube.add(board[RowIndex + j/3][ColIndex + j%3]))
                 return false;
            }
            rows.clear();
            columns.clear();
            cube.clear();
        }
        
        return true;
        */
        
        Set<String> set = new HashSet<>();
        
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
             
                char val = board[row][col];
                
                if (val != '.') {
                    int block = (row / 3 * 3) + (col / 3);
                
                    if (!set.add("r" + row + val) || 
                        !set.add("c" + col + val) ||
                        !set.add("b" + block + val)){
                            return false;
                    }   
                }
            }
        }
        return true;
    }
}