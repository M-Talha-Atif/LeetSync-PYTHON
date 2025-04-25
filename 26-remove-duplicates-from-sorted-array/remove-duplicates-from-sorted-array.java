class Solution {
    public int removeDuplicates(int[] nums) {
        // using same start = 0 logic, inplace replacement
        int i= 0;
        int start = 0;

        while(i < nums.length){

            while( i+1 < nums.length &&  nums[i]==nums[i+1]){
                i+=1;
            }

            nums[start++] = nums[i];
            i+=1;
        }


        return start;
        
    }
}