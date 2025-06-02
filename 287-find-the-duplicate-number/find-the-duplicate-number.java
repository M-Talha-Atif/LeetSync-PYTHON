class Solution {
    public int findDuplicate(int[] nums) {
        if (nums.length < 1) return -1;

        int slow = nums[0];
        int fast = nums[slow];
        // 0->1, 1->3, 2->4, 3->2, 4->2
        
        // find the cycle first
        while ( slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        // now check who started the cycle
        slow = 0; // either make slow or fast 0
         while ( slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow; // in case no cycle

    }
}