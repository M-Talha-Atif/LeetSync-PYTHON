class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[ 2 * n ];
        // fill twice at the time
        for(int i =0; i<n; i+=1){
            result[i] = nums[i];
            result[i+n] = result[i];
            // nums -> [1,2,1]
            // assign like
            // 0 -> 1, 0 + 3 -> 3 -> 1 (value)
            // 1 -> 2, 1 + 3 -> 4 -> 2 (value)

        }
        return result;

        
    }
}