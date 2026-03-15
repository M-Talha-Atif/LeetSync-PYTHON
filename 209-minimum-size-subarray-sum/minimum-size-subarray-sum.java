class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        // only works for positive numbers
        int minLength = Integer.MAX_VALUE;
        int totalSum = 0;
        for( int right = 0; right < nums.length; right ++){
            totalSum += nums[right];
            while ( totalSum >= target ) {
                totalSum-= nums[left];
                minLength = Math.min( minLength, right - left + 1);
                left++;
            }
        }
        
        return minLength==Integer.MAX_VALUE ? 0 : minLength ;

        
    }
}