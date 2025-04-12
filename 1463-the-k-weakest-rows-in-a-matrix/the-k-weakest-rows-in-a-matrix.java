class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int rows = mat.length;
        int cols = mat[0].length;
     PriorityQueue<int[]> minHeap = new PriorityQueue<>(
    (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]
);


        for(int i=0; i< rows; i+=1){
            int soldiers = findSoldierCount(mat[i]);
            minHeap.offer(new int[]{soldiers,i});
        }
        int[] res = new int[k]; // k elements answer
        for(int i=0; i<k; i+=1){
            // 0-> soldiers, 1-> index of row
            res[i] = minHeap.poll()[1];
        }

        return res;
    }

    private int findSoldierCount(int[] row) {
        int left = 0, right = row.length - 1;

        // Perform binary search to find the count of soldiers
        while (left <= right) {
            int mid = (left + right) / 2;
            if (row[mid] == 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}