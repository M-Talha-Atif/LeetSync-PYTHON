class Solution {
    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1 ;

        while(left <= right){
            int mid = (left + right ) / 2;
            System.out.println("------------");

            System.out.println("Mid Index: " + mid );

            System.out.println("Left Index: " + left);

            System.out.println("Left Value: " + nums[left]);

            System.out.println("Right Index: " + right);

            System.out.println("Right Value: " + nums[right]);

            System.out.println("------------");

            if(nums[mid] == target) {
                return mid;
            }

            else if (nums[mid] > target){
                right = mid - 1;
            }

            else {
                left = mid + 1;
            }
        }

        return left;
        
    }
}