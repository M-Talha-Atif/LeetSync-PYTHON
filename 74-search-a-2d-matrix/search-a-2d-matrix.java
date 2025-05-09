class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i=0; i<rows ; i+=1) {

            int left = 0;
            int right= cols-1;
            
            while (left <= right){

                int mid = left + (right - left) / 2;

                if ( matrix[i][mid] > target){
                    right = mid -1;
                }
                else if ( matrix[i][mid] < target) {

                    left = mid + 1;

                }
                else {
                      return true;
                }

            }

        }


        return false;
        
    }
}