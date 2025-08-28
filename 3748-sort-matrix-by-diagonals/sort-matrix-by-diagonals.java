class Solution {
    public int[][] sortMatrix(int[][] grid) {
        // substract row with column for diagonal values
        // store the keys in map, values as sorted ascending or descending
        // top right increasing /ascending, i-j -- j>0
        // bottom left decreasing / descending, i-j -- i>0
        Map<Integer, PriorityQueue<Integer> > mapper = new HashMap<>();
        int rows = grid.length;
        int cols = grid[0].length;
        for ( int row=0; row < rows; row++){
            for ( int col=0; col < cols; col++ ){
                int key = row - col;
                int diagonalValue = grid[row][col];
                mapper.putIfAbsent(key, ( key < 0 ) ? new PriorityQueue<>() : new PriorityQueue<>(Collections.reverseOrder() ));
                mapper.get(key).offer(diagonalValue);
            }
        }
        for ( int row=0; row < rows; row++){
            for ( int col=0; col < cols; col++ ){
                int key = row - col;
      
                
                grid[row][col] = mapper.get(key).poll();
            }
        }

        return grid;
        
    }
}