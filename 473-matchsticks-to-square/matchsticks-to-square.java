class Solution {
    public boolean makesquare(int[] matchsticks) {

        // length is 1 -- 15
        // result is boolean type, true false
        // edge case, when we can make square like figuring out for false

        // 1,1 | 2 | 2 | 2
        // 3 | 3 | 3 | 4,3
        // k = 4
        int totalSum = 0;
        int k = 4;
        for (int num : matchsticks) totalSum += num;
        if (totalSum % k != 0) return false;
        int target = totalSum / k;
        Arrays.sort(matchsticks);
        int n = matchsticks.length - 1;
        int lastElement = matchsticks[n];
        if ( lastElement > target ) return false; // can't make a square

        int[] buckets = new int[k];
        return backTrack(n, matchsticks, k, buckets, target);
    }

    public boolean backTrack( int index, int[] nums, int k, int[] buckets, int target){
        if ( index < 0){
            for (int b : buckets) {
                if (b != target) return false;
            }
            return true;

        }

        for ( int  i=0; i < buckets.length; i++){
               // try to put num in bucket[i]
            int num = nums[index];
            if (buckets[i] + num <= target) {
                buckets[i] += num;
                
                if (backTrack(index-1, nums, k, buckets, target)) {
                    return true;
                }
                
                buckets[i] -= num; // backtrack
            }

            if (buckets[i] == 0) break; // to skip states [5,0,0,0] | [0,5,0,0]

        }

        return false;
    }
}