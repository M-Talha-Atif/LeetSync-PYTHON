class Solution {
    public int numSubseq(int[] nums, int target) {
       
        int left = 0;
        int right = nums.length - 1;
        int res = 0;
        int mod =  1000000007;
         // Precompute powers of 2 modulo mod
        List<Integer> power = new ArrayList<>();
        power.add(1);
        for (int i = 1; i <= nums.length; i++) {
           power.add( (power.get(i-1) << 1 ) % mod );
        }

        Arrays.sort(nums); // sort the array
        // 3,5,6,7
        while (left<=right){

            if( nums[left] + nums[right] > target ){
                right-=1;
            }
            else {
           
                res = ( res + power.get(right - left++) )  % mod; // 2 ** n
            }
        }

        return res;
        // 1,2,3 -> 1,2,3, | 1,2 | 1,3 | 
        
    }

    // 3,5,6,7
    // 3+7 is 10
    // 3,6 is 9
    // 2^2 -> 4
    // 3 | 3,5 | 3,6 | 3,5,6

}