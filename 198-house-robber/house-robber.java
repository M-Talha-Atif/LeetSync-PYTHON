class Solution {
    public int rob(int[] nums) {
        Map<Integer,Integer> memo = new HashMap<Integer, Integer>();

        return rob( nums, memo, 0 );
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