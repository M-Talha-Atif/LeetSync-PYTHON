class Solution {
    public int maximumDifference(int[] nums) {
        int mini = nums[0];
        int maxDiff = Integer.MIN_VALUE;

        for( int i=1; i<nums.length; i+=1)
        { 
            if ( nums[i] > mini ){

                int diff = nums[i] - mini;

                maxDiff = Integer.max( maxDiff , diff );

            }

            mini = Integer.min(mini, nums[i]);

        }
        if( maxDiff == Integer.MIN_VALUE ){
            return -1;
        }

        return maxDiff;


        
    }
}