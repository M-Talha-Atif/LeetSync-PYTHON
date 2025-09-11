class Solution {
    // two states
    // skip current house then prev houses money stored dp[i-1]
    // take current house then pick money from house 2 steps behind dp[i-2]
    public int rob(int[] nums) {

        return rob( nums, 0, nums.length );
    }
    private int rob( int[] nums, int start, int end){
        int prev1=0; // current money
        int prev2=0; // money before prev1
        
        for (int num : nums) {
            int robCurrent = num + prev2; // Rob this house
            int skipCurrent = prev1;      // Skip this house

            int curr = Math.max(robCurrent, skipCurrent);

            prev2 = prev1; // Slide window
            prev1 = curr;
        }

        return prev1;
    }

    private int rob(int[] nums, Map<Integer,Integer> memo, int index){

        if ( index >= nums.length ){
            return 0;
        }
        if ( !memo.containsKey(index)){

            int pick = nums[index] + rob(nums,memo, index+2);
            int npick = rob(nums,memo, index+1); // move to next house without picking

            memo.put( index,  Math.max(pick, npick ));
        }

        return memo.get(index);
    }
}