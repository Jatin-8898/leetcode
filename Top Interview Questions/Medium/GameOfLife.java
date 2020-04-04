class Solution {

    /*  TIME  O(m*n) 
        SPACE O(m*n) 
    */
    public void gameOfLife(int[][] board) {

        // Neighbors array to find 8 neighboring cells for a given cell
        int[] neighbors = {0, 1, -1};

        int rows = board.length;
        int cols = board[0].length;

        
        // Declare a copy of the original board
        int[][] copyBoard = new int[rows][cols];

        // Initialise a copy of the original board
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                copyBoard[row][col] = board[row][col];
            }
        }
        
        

        // Iterate through board cell by cell.
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                // For each cell count the number of live neighbors.
                int liveNeighbors = 0;

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {

                        if (!(neighbors[i] == 0 && neighbors[j] == 0)) {
                            int r = (row + neighbors[i]);
                            int c = (col + neighbors[j]);

                            
                            // Check the validity of the neighboring cell 
                            // And whether it was originally a live cell.
                            // The evaluation is done against the copy,since that is never updated.
                            if ((r < rows && r >= 0)    &&  (c < cols && c >= 0)   &&
                                (copyBoard[r][c] == 1)) {
                                liveNeighbors += 1;
                            }
                        }
                    }
                }

                // Rule 1 or Rule 3
                if ((copyBoard[row][col] == 1) && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    board[row][col] = 0;
                }

                // Rule 4
                if (copyBoard[row][col] == 0 && liveNeighbors == 3) {
                    board[row][col] = 1;
                }
            }
        }
    }

    /* Solve it in-place  
    Remember that the board needs to be updated at the same time: You cannot update some cells first and then use their updated values to update other cells. */
    public void gameOfLifeEff(int[][] board) {
        int n = board.length,
            m = board[0].length;
    
        int[] di = {-1, -1, -1,  0, 0,  1, 1, 1};
        int[] dj = {-1,  0,  1, -1, 1, -1, 0, 1};
    
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                
                int live = 0;
    
                for (int k = 0; k < 8; k++) {
                    int ii = i + di[k], 
                        jj = j + dj[k];
        
                    if (ii < 0 || ii >= n || jj < 0 || jj >= m)       //Base case like isSafe 
                        continue;
            
                    if (board[ii][jj] == 1 || board[ii][jj] == 2) 
                        live++;
                }
            

                if (board[i][j] == 1 && (live < 2 || live > 3)) {
                    board[i][j] = 2;
                } else if (board[i][j] == 0 && live == 3) { 
                    board[i][j] = 3;
                }
            }
        }
    
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) { 
                board[i][j] %= 2;
            }
        }
      }
}