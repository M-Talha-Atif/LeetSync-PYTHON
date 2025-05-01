class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
    int n = nums.length;
    int[] result = new int[n - k + 1];
    TreeMap<Integer, Integer> map = new TreeMap<>();

    for (int i = 0; i < n; i++) {
        
        // Add current element
        map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        // Remove element going out of window
        if (i >= k) {
            int out = nums[i - k];
            if (map.get(out) == 1) map.remove(out);
            else map.put(out, map.get(out) - 1);
        }

        // Add max to result
        if (i >= k - 1) {
            result[i - k + 1] = map.lastKey(); // max in current window
        }
    }

    return result;







        
    }
}