class Solution {
    public Integer leastInterval(char[] tasks, Integer n) {
        Integer time = 0;
        // count frequencies
        Map<Character,Integer> counter = new HashMap<Character,Integer>();
        for(char c : tasks){
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Integer> data = new PriorityQueue<Integer>( (  (a,b) -> b-a )  );
        for(Integer val : counter.values()){
           System.out.print(val);
            if(val>0){
               data.offer(val);
            }
        }
        while(!data.isEmpty()){
            List<Integer> temp = new LinkedList<Integer>();
            // n+1 tasks gets solved first
            if(!data.isEmpty()){

            for(Integer i=1; i<=n+1; i+=1){
                Integer freq = data.poll();
                
                 if (freq != null && freq > 0) {
            temp.add(freq - 1); // safer than --freq
        }
            }


            }
            // repush the extracted elements with new frequency
            for(Integer i : temp){
                if (i>0)
                  data.offer(i);
            }
            
            // with idle time
            if(!data.isEmpty()){
                time+= n+1;
            }
            else{
                time+= temp.size(); // no idle time
            }
        }

        return time;
        
    }
}