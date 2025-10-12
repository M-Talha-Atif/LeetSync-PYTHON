class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // either climb one or two

        // let say start from 0 
        int first=cost[0]; // 
        int second=cost[1]; // 
        int n = cost.length;
        if ( n<=2 ) return Math.min(first, second);
        for ( int i=2; i<n; i++){
            int current = cost[i] + Math.min(first,second);
            first = second;
            second = current;
        }

        return Math.min(first,second);
        // index 1 value depend on index 0
        // index 2 value depend on 0 and 1

        
        
    }


}
