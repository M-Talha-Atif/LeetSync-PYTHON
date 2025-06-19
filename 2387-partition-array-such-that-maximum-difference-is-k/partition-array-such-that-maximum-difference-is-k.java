class Solution {
    public int partitionArray(int[] nums, int k) {

        Arrays.sort(nums);
        int count = 0;

     

        int j=0;
    
        for(int i=1; i<nums.length; i+=1 ){
            if ( nums[i]  - nums[j]   >   k){
                count++;
                j=i; // next subsequence start
            }
        }

        return count+1;



        
    }
}