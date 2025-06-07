class Solution {
    public int[][] kClosest(int[][] points, int k) {

        Queue<int[]> que = new PriorityQueue<>(k, (a, b) -> Integer.compare(distance(a), distance(b)));
        for (int[] p : points) {
            que.add(p);
        }
        // only top k elements
        int[][] myAnswer = new int[k][2];


        while (  !que.isEmpty() && k > 0) 
        {
            myAnswer[--k] = que.remove();
        }
        return myAnswer;

        
        
    }

    private int distance(int[] singleP) {
        return (singleP[0] * singleP[0]) + (singleP[1] * singleP[1]);
    }
}