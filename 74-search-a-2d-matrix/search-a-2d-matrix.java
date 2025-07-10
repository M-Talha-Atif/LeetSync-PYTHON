class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int columns = matrix[0].length;
        int left = 0;
        int right = 0;
        for (int row=0; row<rows; row++){
            left = 0;
            right = columns-1;
            while ( left <= right){
                int mid = left + (right - left) / 2;
                if (  matrix[row][mid] == target ){
                    return true;
                } 
                else if (matrix[row][mid] < target){
                    left = mid + 1;
                } 
                else {
                    right = mid - 1 ;
                }
            }

        }

        return false;
        
    }
}