class Solution {
    public int missingNumber(int[] nums) {
        // System.out.println(nums);

        int n = nums.length;

        if ( n==1 && nums[0] == 0){
            return 1;
        }

        if (n == 1){
            return nums[0]-1;
        }
      

        int res = n;
       
        for(int i=0; i<n; i+=1){
         
            res ^= i;
            res ^= nums[i];
        }

        return res;
        
    }
}