class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {

        // FOUND INDEX
        // index 7-> 2,1,3
        // index 5-> 4,6
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        int right = 0; 
    
        for (int j = 0; j < n; ++j) {
            if (nums[j] == key) {
                int left = Math.max(right, j - k);
                right = Math.min(n - 1, j + k) + 1;
                for (int i = left; i < right; ++i) {
                    result.add(i);
                }
            }
        }
        return result;
        // right always make sure that left startes after from 1 postion after where last right finsihes righ
        //    2 -> 1,3
        //    right=3, left=1
        //    left=3, right=4
        //    5 -> 4,6
         
    }


}