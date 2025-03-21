class Solution {
    public int maxSum(int[] nums) {
        if (nums.length==1)
           return nums[0];

        Arrays.sort(nums);
        int total = 0;
        int countNeg=0;
        for (int i=0; i<nums.length; i++){
            while( i+1<nums.length && nums[i]==nums[i+1] ) {
                 if (nums[i+1]<0)
                    countNeg+=1;
                 i+=1;
            }
            if (nums[i]>0)
               total += nums[i];
            else if (nums[i]<0)
                 countNeg+=1;
                  
        } 
        if (countNeg==nums.length) // return maximum then
           return nums[nums.length-1];
        return total;
    }
}