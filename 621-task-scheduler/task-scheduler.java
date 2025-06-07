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
        // take out n+1 elements from array with -1 frequency to each
        // add n+1 to time if que has elements, it will handle idle time as well
        // add list size if que becomes empty


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
/* 
Tasks -> A to Z and a number -> n

n intervals
AB
-----
1 to n+1

3,3

size is now 2, elements are 2,2

2,2

A,B,idle,idle
-----
n = 1
A,B -> n=2, you did two tasks for n=1
-----
n = 2
-----
A,B,C -> n+1

A,B,C --> one round and n+1 tasks done
now let say you got only A and y

A had two frequency and n = 2
characters are A,A,B,C

in one round, 2,1,1 done? so A,B,C done? -> time would be n+1 that is 3 why 3 as we did 3 tasks, if we had A,B only then one idle time would be compensated, 1 is added as 1 task done minumum?
and n is supposed to be gap or either more tasks.
Remaining only -> A, frequency is 1 so we got 0 in our list and your que is empty and list having 1, so these are only last tasks no more idle time right?
Priority que empty so we got, data.size() as time added*/