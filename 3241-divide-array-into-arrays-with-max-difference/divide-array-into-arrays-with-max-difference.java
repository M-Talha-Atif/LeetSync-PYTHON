class Solution {
    public int[][] divideArray(int[] nums, int k) {
        // sorting the array
        Arrays.sort(nums);
        int n = nums.length;

        int[][] result = new int[n/3][3];
        int row = 0;

        // 0 -> 0,1,2
        // 1 -> 0,1,2

        for(int i=0; i<n;i++){

            int col = i%3;

            if(i>0 && i%3==0){

            if(  

            (  result[row][2] - result[row][0] > k ) 
            ||
            
             ( result[row][1] - result[row][0] > k ) 
            ||
             ( (result[row][2] - result[row][1] > k) ) 

            ) 
            {
                return new int[0][0];
            }
                row+=1;
            }
            
            result[row][col] = nums[i];

          
        }
        int col = 2;
         if(  

            (col>0 && (result[row][col] - result[row][col-1] > k) ) 
            ||
            
             ( col>1 && result[row][col] - result[row][col-2] > k ) 
            ||
             ( col>1 && (result[row][col-1] - result[row][col-2] > k) ) 

            ) 
            {
                return new int[0][0];
            }
        



        return result;

        
    }
}