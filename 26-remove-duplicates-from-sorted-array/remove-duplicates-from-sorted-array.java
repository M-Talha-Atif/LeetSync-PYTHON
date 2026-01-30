class Solution {
    public int removeDuplicates(int[] nums) {
        int counter = 0;
        // 
        nums[counter++] = nums[0]; // first number will always be unique and will not enter again
        // 0 0, - 0 1
        for ( int i=1; i<nums.length; i++){

            if (nums[i] != nums[i-1]){
                nums[counter] = nums[i];
                counter+=1;
            }

        }

        return counter;
        
    }
}