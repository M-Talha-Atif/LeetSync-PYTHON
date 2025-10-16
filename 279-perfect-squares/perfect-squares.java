class Solution {
    // two coin problem if i make the perfect squares array
    public int numSquares(int n) {

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            list.add(i * i);
        }
        int[] ps = list.stream().mapToInt(Integer::intValue).toArray();

        int[][] dp = new int[ps.length][n + 1];

        // -1 fill so that we can check place is filled or not
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int res = helper(ps, 0, n, dp);
        // if not possible, return -1
        return (res >= (int) 1e9) ? -1 : res;

    }

    // 1,4,9,25
    private int helper(int[] pSquares, int index, int number, int[][] dp) {
        // Base case: exact number achieved
        if (number == 0) {
            return 0;
        }

        // Base case: ran out of pSquares but still have number left
        if (index == pSquares.length) {
            return (int) 1e9; // large value to represent infinity
        }

        // Memoization check
        if (dp[index][number] != -1) {
            return dp[index][number];
        }

        int res;
        // If coin is larger than remaining number, skip it
        if (pSquares[index] > number) {
            res = helper(pSquares, index + 1, number, dp);
        } else {
            // take coin (stay at same index)
            int take = 1 + helper(pSquares, index, number - pSquares[index], dp);
            // skip coin (move to next index)
            int notTake = helper(pSquares, index + 1, number, dp);
            res = Math.min(take, notTake);
        }

        dp[index][number] = res;
        return res;
    }
}