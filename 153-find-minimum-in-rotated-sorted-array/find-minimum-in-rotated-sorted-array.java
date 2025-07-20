class Solution {
    public int findMin(int[] nums) {
        // discover at which point the the array is rotated

        // middle value comparing with left and right

        // 7 middle then left small than 7 and right also small
        // find middle point
        // last element greater than mid then search in left half
        // last element less than mid then search in right half
        int left = 0;
        int right = nums.length - 1;
        while ( left < right )
        {
            int mid = left + ( right - left ) / 2;
            if ( nums[mid]  > nums[right] ){
                left = mid + 1;
            }
            else {
                // mid smaller , then shrink from right 
                right = mid;
            }
        }

        return nums[left];
        
    }
}