class Solution {
    public int removeDuplicates(int[] nums) {

        int counter = 0;
        nums[counter++] = nums[0];
        int n = nums.length;
        int start = 1;
        for ( start=1; start<n; start++ )
        {
            if ( nums[start] != nums[start-1])  
            {
                
                nums[counter++] = nums[start];
                 
            }
        }

        return counter;
    }
}