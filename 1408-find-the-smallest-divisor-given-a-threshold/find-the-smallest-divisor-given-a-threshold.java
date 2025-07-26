class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        // log n * n
        int left = 1, right = findMax(nums);
        while (left < right) {
            int m = left + (right - left) / 2, sum = 0;
            for (int i : nums)
                sum += Math.ceil((double) i / m);

            if (sum > threshold) // look for big number
                left = m + 1;
            else
                right = m;
        }
        return right;

        
    }

       public static int findMax(int[] arr) {
            if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("Array cannot be null or empty.");
            }
            int max = arr[0]; // Assume the first element is the maximum
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }
}