class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right ){
            int mid = left + (right - left) / 2;
            int x = nums[mid];
            if (x == target){
                return mid;
            }
            else if (x > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }

        }

        return -1;
        
    }
}