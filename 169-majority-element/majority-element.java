class Solution {
    public int majorityElement(int[] nums) {
        // sort the array
        // 3,2,3
        // 2,3,3, index is 1, 3/2 is 1

        // 2,2,1,1,1,2,2
        // 1,1,1,2,2,2,2, index = 3, 7/2 is 3
        Arrays.sort(nums);
        return nums[ nums.length / 2];
        
    }
}