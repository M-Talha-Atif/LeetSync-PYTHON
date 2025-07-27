class Solution {
    public int[] getConcatenation(int[] nums) {
        // 1,2,1 -- 1,2,1
        // 2 times placement
        // n * 2 -> size 
        int n = nums.length;
        // intially array all elements are zero
        int[] result = new int[n*2];
        System.out.println( result[0] );
        for(int i=0; i<n; i++){
            result[i] = nums[i];
            result[i+n] = result[i]; 
        }

        return result;
        
    }
}