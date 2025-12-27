class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int inDegree[] = new int[n+1];
        int outDegree[] = new int[n+1];
        // out Degree of a node zero that's the judge and indegree == n-1
        for ( int t[]: trust){
            int a = t[0];
            int b = t[1];
            inDegree[b]++; // trust
            outDegree[a]++; // a guy who is trusting
        }
         for (int num=1; num<=n; num++){
            if ( outDegree[num]== 0 && inDegree[num] == n-1){
                return num;
            }
        }

        return -1;
    }
}