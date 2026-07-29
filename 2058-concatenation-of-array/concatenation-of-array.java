class Solution {
    public int[] getConcatenation(int[] nums) {
        // 0,1,2,3,4,5
        // 
        int n = nums.length;
        int totalLength = n * 2;
        int[] result = new int[totalLength];
        for ( int i=0; i < totalLength; i++){
           result[i] = nums[ i % n ] ;
        }

        return result;
        
    }
}