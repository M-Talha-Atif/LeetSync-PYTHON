class Solution {
    public int sumOfSquares(int[] nums) {

        int n = nums.length; // find the length
        // factors of n
        int ans = 0;

        for ( int i=0; i<n; i+=1){
            int fact = i+1;
            if ( n % fact == 0){
                ans += nums[i] * nums[i];
            }
        }

        return ans;
        
    }
}