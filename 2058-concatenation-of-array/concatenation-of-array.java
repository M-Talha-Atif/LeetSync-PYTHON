class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length*2;
        int length = nums.length;
        int[] res = new int[n];
        // 0,1,2,
        // 6 -> 0, 1, 2
        // 0, 1, 2, 3 , 4, 5 
       

        for (int i=0; i<n; i++){
            res[ i ] = nums[ i % length ];
        }

        return res;
        
    }
}