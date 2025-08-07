 // first consider prefix sum
    // prefix sum in this case
    // 1, 2, 3, 4, 5, 6 , 7 , 8
    // calculate sum for range 3 -- 5 that will be
    // sum before 3 and sum after 5 and take subtraction
    // (6+7+8) - (1+2)

class NumMatrix {

    int[][] sum;
    public NumMatrix(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        sum = new int[matrix.length][matrix[0].length];
        sum[0][0] = matrix[0][0];
        
        /* Pre process first row*/
        for(int j = 1; j < matrix[0].length; j++) {
            sum[0][j] = matrix[0][j] + sum[0][j - 1];
        }
        
         /* Pre process first col*/
        for(int i = 1; i < matrix.length; i++) {
            sum[i][0] = matrix[i][0] + sum[i - 1][0];
        }
        
        /* Pre process rest of the rows and cols */
        for(int i = 1; i < matrix.length; i++) {
            for(int j = 1; j < matrix[0].length; j++) {
                
                sum[i][j] = matrix[i][j] + sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1];       
            }
        } 
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
       
        int total = sum[row2][col2];
        
        if(row1 - 1 >= 0) {
            total = total - sum[row1 - 1][col2];
        }
        if(col1 - 1 >= 0) {
            total = total - sum[row2][col1 - 1];
        }
        if(row1 - 1 >= 0 && col1 - 1 >= 0) {
            total = total + sum[row1 - 1][col1 - 1];
        }
        return total; 
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */