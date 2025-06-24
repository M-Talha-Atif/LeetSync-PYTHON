class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {

        // FOUND INDEX
        // index 7-> 2,1,3
        // index 5-> 4,6
       List<Integer> result = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (nums[j] == key && Math.abs(i - j) <= k) {
                    result.add(i);
                    break; // avoid duplicates
                }
            }
        }
            return result;
    }


}