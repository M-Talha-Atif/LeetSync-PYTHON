class Solution {
    public int countNegatives(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for(int row=0; row < rows; row+=1){
            int left = 0;
            int right = cols-1;
            while (left <= right)
            {
            int mid = left + ( right - left ) / 2;
            int target = grid[row][mid];
            // found first negative, will shrink more to find negatives
            if ( target < 0 )
            {
                right = mid - 1;
            }
            // greater than or zero than shrink
            else {
                left = mid +1;
            }   
            }
            System.out.println(left);
            count += cols - left;
        
    }

    return count;

   
}

}