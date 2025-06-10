class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n =score.length;

          PriorityQueue<Pair<Integer, Integer>> maxheap = new PriorityQueue<>((p1, p2) -> (p2.getValue() - p1.getValue()));
        
        for (int i = 0 ; i < n ; i++) {
            maxheap.add(new Pair(i, score[i]));
        }

    String[] res = new String[n];
    int p = 1;
    while( !maxheap.isEmpty()) 
    { 
         Pair<Integer, Integer> top = maxheap.poll();
         int index = top.getKey();

          if (p == 1) {
                res[index] = "Gold Medal";
            } else if (p == 2) {
                res[index] = "Silver Medal";
            } else if (p == 3) {
                res[index] = "Bronze Medal";
            } else {
                res[index] = String.valueOf(p);
            }


         p+=1;


    }

    return res;




       


        
    }
}