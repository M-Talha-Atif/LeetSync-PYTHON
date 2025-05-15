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
      

        
        Arrays.sort(nums);
       
        for(int i=0; i<n; i+=1){
         
            if ( nums[i] != i ){
                return i;
            }
        }

        return nums[ n-1 ] + 1;
        
    }
}