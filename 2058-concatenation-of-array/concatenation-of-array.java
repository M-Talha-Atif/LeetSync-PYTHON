class Solution {
    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int resLength = n*2;

        int[] res = new int[resLength];

        for ( int i=0; i < resLength; i++)
        {  
            // 0,1,2,3,4,5
            // 3%3 is 0
            res[i] = nums[ i % n ];
            
        }

        return res;
        
    }
}