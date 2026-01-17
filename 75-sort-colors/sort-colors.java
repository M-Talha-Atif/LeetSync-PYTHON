class Solution {
    public void sortColors(int[] nums) {
        // dutch national flag approach
        int left=0, right = nums.length-1, mid =0;

        while ( mid<=right ){
            if (nums[mid] == 0){
                // 0 should be on left
                int temp = nums[mid];
                nums[mid] = nums[left];
                nums[left] = temp;
                left+=1;
                mid+=1;
            }
            else if (nums[mid] == 1){
              mid++; // 1 will remain in middle
            }
            else {
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;
                right-=1;
                
            }
        }
        
    }
}