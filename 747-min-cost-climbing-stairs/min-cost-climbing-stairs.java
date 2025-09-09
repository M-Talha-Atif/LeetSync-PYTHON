class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // pick, not pick
        Map<Integer,Integer> memo = new HashMap<Integer, Integer>();

        return Math.min(minCostClimbingStairs(cost, memo,0), minCostClimbingStairs(cost, memo,1) );
        
    }
    private int minCostClimbingStairs(int[] cost, Map<Integer,Integer> memo, int index ){
        if ( index>= cost.length){
            return 0; // base case
        }

        if ( !memo.containsKey(index)){
            // current value + either next one by increment of 1 or 2
            int pick = cost[index] + minCostClimbingStairs(cost, memo, index+1);
            int nPick = cost[index] + minCostClimbingStairs(cost, memo, index+2);
            int res = Math.min(pick, nPick);
            memo.put( index, res);
        }

        return memo.get(index);

     }
}