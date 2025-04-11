class Solution {
    public int deleteGreatestValue(int[][] grid) {
        // Creating a list of priority queue. It will store the rows.
    	ArrayList<PriorityQueue<Integer>> list=new ArrayList<>();
    	
    	int m=grid.length; // total number of rows in grid.
    	int n=grid[0].length; // total number of columns in grid.

        // Let's fill the list.
    	for (int i=0;i<grid.length;i++) {
    		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
    		for (int j=0;j<grid[0].length;j++) {
    			pq.add(grid[i][j]);
    		}
    		list.add(pq);
			}
			
    	int result=0;
    	for (int i=0;i<n;i++) {
    		int num= 0;
    		for (int j=0;j<m;j++) {
    			PriorityQueue<Integer> pq=list.get(j);
    			int temp = pq.poll();
					
    			num=Math.max(num, temp);
    		}
    		result+=num;
    	}
    	return result;
    	
    }
}