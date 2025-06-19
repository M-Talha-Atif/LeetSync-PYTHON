class Solution {
   public int maxFrequencyElements(int[] nums) {
        int maxCount = 0, occurrences = 0, count[] = new int[101];
        // reset the occruences if new frequency found
        for (int val : nums) {
            int current = ++count[val];
            if (current >= maxCount) {
                occurrences = (current > maxCount) ? 1 : occurrences+1;
                maxCount = current;
            }
        }
        return occurrences * maxCount;
    }
}