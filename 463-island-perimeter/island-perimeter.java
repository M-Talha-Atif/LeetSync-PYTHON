class Solution {

    public int islandPerimeter(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        int perimeter = 0;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == 0) {
                    continue;
                }

                perimeter += 4;

                // shared edge with right cell
                if (j + 1 < cols && grid[i][j + 1] == 1) {
                    perimeter -= 2;
                }

                // shared edge with bottom cell
                if (i + 1 < rows && grid[i + 1][j] == 1) {
                    perimeter -= 2;
                }
            }
        }

        return perimeter;
    }
}