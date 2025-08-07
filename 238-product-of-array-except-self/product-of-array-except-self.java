class Solution {
    public int[] productExceptSelf(int[] nums) {
        // for each element pre calculate prefix product and suffix product
        // like for 2 it will be 1 for prefix and suffix will be 12
        int n = nums.length;
        int[] pref = new int[n];
        int[] suffix = new int[n];
        pref[ 0 ] = 1;  // answer will be same for first element and last one
        suffix[ n-1 ] = 1;
        for (int i=1; i < n; i++){
            pref[i] = pref[i-1] * nums[i-1];
        }
        for (int i=n-2; i >=0; i--){
            suffix[i] =  suffix[i+1] * nums[i+1];
        }
         for(int i = 0; i < n; i++) {
            nums[i] = pref[i] * suffix[i];
        }

        return nums;
        
    }
}