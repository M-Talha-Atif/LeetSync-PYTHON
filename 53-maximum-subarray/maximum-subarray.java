class Solution {
    public int maxSubArray(int[] nums) {

        int currSum = 0;
        int targetSum = nums[0];
        for(int num : nums){
            currSum = Integer.max(currSum, 0);
            currSum+=num;
            targetSum = Integer.max(currSum,targetSum);
        }

        return targetSum;
 
    }
}