class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int island=0;
        for ( int row =0; row<rows; row++)
        {
            for ( int col =0; col<cols; col++){

                if (   grid[row][col] != '0' ){

                    island+=1;

                    dfs( grid, row, col, rows, cols);

                }
            }
        }

        return  island;
        
    }

    public void dfs(char[][] grid, int row, int col, int rows, int cols){
        // out of index check
        if ( row>=rows || col>=cols || row<0 || col<0 || grid[row][col] == '0' ) return; // no more further explore

        grid[row][col] = '0'; // mark visited
        // different directions iteration, up down left right
        dfs( grid, row-1, col, rows, cols);
        dfs( grid, row+1, col, rows, cols);
        dfs( grid, row, col-1, rows, cols);
        dfs( grid, row, col+1, rows, cols);
    }
}