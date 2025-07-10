class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        //
        while ( left < right ){
            int mid = left + (right - left) / 2;

            if ( target == nums[mid] ){
                return mid;
            }
            else if (target < nums[mid]){
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        // <=, in case insert at start or at same index
        // > next to it
        // bound will stop at left index

        return nums[left]<target ? left+1 : left;
        
    }
}