class Solution {
    public int islandPerimeter(int[][] grid) {
        // 1 side connecting both sides so minus 2 that's why
        int rows = grid.length;
        int cols = grid[0].length;
        int perimiter = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == 1) {
                    perimiter += 4;
                    // check inside to subtract -2 for neighbours
                    if (row > 0 && grid[row - 1][col] == 1) {
                        perimiter -= 2;
                    }
                    if (col > 0 && grid[row][col - 1] == 1) {
                        perimiter -= 2;
                    }
                }

            }
        }
        return perimiter;

        
    }
}