class Solution {
    public int[] productExceptSelf(int[] nums) {
        // for each element pre calculate prefix product and suffix product
        // like for 2 it will be 1 for prefix and suffix will be 12
        int n = nums.length;
        // int[] pref = new int[n];
        // int[] suffix = new int[n];
        // pref[ 0 ] = 1;  // answer will be same for first element and last one
        // suffix[ n-1 ] = 1;
        int[] ans = new int[n];
        int mult = 1;
        // each time we have previous value
        for (int i=0; i < n; i++){
            ans[i] = mult;
            mult *= nums[i];
           
        }
        mult = 1;
        for (int j=n-1; j >=0; j--){
            // can't use = as previous pref value will be gone
            ans[j] *= mult;
            mult *= nums[j];
        }
        
        // pref -> 1, 1, 2, 6
        // suff ->  24 12 4  1

        return ans;
        
    }
}