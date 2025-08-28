class Solution {
    public int findJudge(int n, int[][] trust) {
        // directed graph
        // indegree equals n and outdgree equals zero such a node to be find
        int rows = trust.length;
      

        int[] trusting = new int[n+1];
        for ( int i=1; i<=n; i++){
            trusting[i] = 0;
        }
      
       ;
        for ( int row=0; row<rows; row+=1)
        {   

            trusting[  trust[row][0] ] -=1; // no trust
            trusting[  trust[row][1] ] +=1; // trust build

        }
        for ( int i=1; i<=n; i++){
            if ( trusting[i] == n-1 ) return i; 
        }

        return -1;
        
    }
}