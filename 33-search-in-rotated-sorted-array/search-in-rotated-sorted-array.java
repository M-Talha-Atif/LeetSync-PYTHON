class Solution {
    public int search(int[] nums, int target) {
        
        // array is again rotated and sorted
        // target can be in sorted and unsorted array
        // mid value
        int left = 0;
        int right = nums.length - 1;
        while ( left <= right ){
            int mid = left + (right - left) / 2;
          
            if ( nums[mid] == target ){
                return mid;
            }
            // right part sorted
            // 4,5,6
            
            // im in right half as mid point in right half
            if ( nums[mid]  < nums[ left] ){
                // shrink from left half
                if ( nums[mid] <= target && target <= nums[right]){
                   left = mid + 1;
                }
                // in case target > mid and even greater than right
                else {
                 
                       right = mid;
                }
            }
            // im in left half as mid point in left half
            else {
                // mid smaller , then shrink from right 
                if ( nums[left] <= target && target <= nums[mid]){
                   
                    right = mid;
                  
                }
                else {
                     left = mid + 1;
                }
            }
        }

        return -1;

        }
}