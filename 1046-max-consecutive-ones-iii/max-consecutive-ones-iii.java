class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int maximumOnes = 0;
        int maximumWindowSize = 0;
        // 1,1,1,0,0,0 - if [number == 1] maximumOnes -=1
        for( int right=0; right < nums.length; right ++){
            // count maximum ones
            if ( nums[right] == 1 ) {
                maximumOnes+=1;
            }
            // window size
            int windowSize = right - left + 1;
            if ( windowSize - maximumOnes > k  ) {
                // start removing from left 
                if ( nums[left] == 1) {
                    maximumOnes-=1;
                }
                left+=1; // move pointer to exclude 0 or 1
            }
            // take the maximum elements as 1
            maximumWindowSize  = Math.max ( maximumWindowSize , right - left + 1);
        }

        return maximumWindowSize;
    }
}