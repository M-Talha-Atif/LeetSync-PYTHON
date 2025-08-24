class Solution {
    public int longestSubarray(int[] nums) {

        int countZeros = 0;
        // left as variable
        // right as variable
        int left = 0;
        int right =0;
        int res = 0;
        while ( right < nums.length ){
            if ( nums[right] == 0){
                countZeros +=1;
            }
            while ( countZeros > 1 ){
                if ( nums[left] == 0){
                    countZeros-=1;
                }
                left+=1;
            }

            res = Math.max( res, right - left);
            right+=1;

        }

        return res;
        
    }
}