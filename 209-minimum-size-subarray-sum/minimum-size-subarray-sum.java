class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        // length minimum
        // sum greater than  or equal to target 
        // count less than sum
        int left = 0;
        int currSum = 0;
        int len = 100000;
        int n = nums.length;

        for(int right=0; right < nums.length; right+=1){

            currSum += nums[right];

            while(currSum>=target){
                currSum-=nums[left];
                left+=1;
                len = Math.min(len, right - left + 1);
            }

        }

        if(len == 100000)
           return 0;

        return len+1;
        
    }


}