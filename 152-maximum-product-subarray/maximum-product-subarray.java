class Solution {
    // demanding a integer from sub array
    public int maxProduct(int[] nums) {
        // a sub array with maximum product
        // -10 to 10
        // brute force approach
        int n = nums.length;
        // nested loop -> Big O of n^2
        // 2 with 3,-2,4
        // 3 wiht -2,4
        int res = -11;
        for (int i = 0; i < n; i++) { // outside loop
            int localProduct = nums[i];
            res = Math.max( localProduct, res);
            for (int j = i+1; j < n; j++) { // inside loop
                localProduct *= nums[j];
                res = Math.max( localProduct, res);

            }
            
        }

        return res;

    }
}