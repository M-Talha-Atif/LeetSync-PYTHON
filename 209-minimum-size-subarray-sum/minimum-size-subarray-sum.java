class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int n = nums.length - 1;
        int totalLength = 10000000;
        // minimal length
        // 2,3,1,2
        // inside while calculate length
        int sum = 0;
        for (int right = 0; right<=n; right++ )
        { 
            sum+= nums[right];
            while( sum>= target){
                totalLength = Integer.min(totalLength, right - left + 1);
                sum-=nums[left];
                left++;
            }
        }
        return totalLength==10000000 ? 0 : totalLength;
        
    }
}