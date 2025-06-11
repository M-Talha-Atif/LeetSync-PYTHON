class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> data = new  PriorityQueue<Integer>();

        for(int[] row : matrix){
            for(int item : row){
                data.offer(item);
            }
        }
        

    int res = 0;
    while   ( k > 0 ) 
    {
        res = data.poll();
        k--;
    }

    return res;
}

}