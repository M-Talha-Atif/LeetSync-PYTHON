

class Solution {
    public int integerBreak(int n) {
        // dp[i] = maximum product for breaking integer i
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        // call helper function
        return helper(n, dp);
    }

    private int helper(int n, int[] dp) {
        // Base cases:
        // We return n itself (not 1) here, because in recursion we
        // sometimes need to multiply by f(n - i) — not always split.
        if (n == 1) return 1;

        // If already computed, return it
        if (dp[n] != -1) return dp[n];

        int maxProduct = 0;

        // Try breaking n into i + (n - i)
        for (int i = 1; i < n; i++) {
            // Case 1: don't split further (i * (n - i))
            int noSplit = i * (n - i);

            // Case 2: split the second part further (i * helper(n - i))
            int splitFurther = i * helper(n - i, dp);

            // take max of all possibilities
            maxProduct = Math.max(maxProduct, Math.max(noSplit, splitFurther));
        }

        dp[n] = maxProduct;
        return maxProduct;
    }

}
