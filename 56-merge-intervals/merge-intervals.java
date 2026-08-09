class Solution {

    public int[][] merge(int[][] intervals) {

        // 1. Sort by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        // First interval
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];

            // 2. Overlap
            if (currentStart <= end) {

                end = Math.max(end, currentEnd);

            }
            // 3. No overlap
            else {

                result.add(new int[]{start, end});

                start = currentStart;
                end = currentEnd;
            }
        }

        // Add final interval
        result.add(new int[]{start, end});

        return result.toArray(new int[result.size()][2]);
    }
}