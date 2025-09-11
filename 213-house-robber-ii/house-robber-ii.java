class Solution {
    public int rob(int[] nums) {
        Map<Integer,Integer> memo = new HashMap<Integer, Integer>();
        int n = nums.length;
        if (n == 1) return nums[0]; // edge case

        int[] skiplast = new int[n- 1];
        int[] skipfirst = new int[n- 1];

        for(int i = 0; i < n- 1; i++){
            skiplast[i] = nums[i];
            skipfirst[i] = nums[i + 1];
        }

        int firstSkip = rob( skipfirst, new HashMap<>(), 0);
        int lastSkip =  rob( skiplast, new HashMap<>(), 0);



        return firstSkip > lastSkip ? firstSkip : lastSkip;
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