class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> que = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(Integer gift : gifts){
            que.offer(gift);
        }

        for(int i=0; i<k ; i+=1){
            int item = que.poll();
            que.offer((int) Math.floor(Math.sqrt(item)));

        }

        long total = 0;
        while(!que.isEmpty()){
            total += que.poll();
        }
        return total;
        
    }
}