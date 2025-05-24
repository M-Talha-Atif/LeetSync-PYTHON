class Solution {

   
    public String reorganizeString(String s) {

        class Pair {
            int frequency;
            char character;
            Pair (int f, char c){
                this.frequency = f;
                this.character = c;
            }
        }

        // a b a
        Map<Character,Integer> map = new HashMap<Character,Integer>();

        // store frequency of each character in a map
        for ( char c : s.toCharArray() ) {
            map.put(c ,map.getOrDefault(c,0)  + 1 );
        }

        // Priority Queue
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(

            (a,b) -> b.frequency - a.frequency
        );


   // for each accepts bi consumer

    map.forEach(  (character, frequency) -> 
    {
        Pair object = new Pair(frequency, character);

        pq.offer( object );

    });

    String res = "";


    while( pq.size() > 1){

        Pair o1 = pq.poll();
        Pair o2 = pq.poll();
        res+= o1.character;
        res+= o2.character;
        o1.frequency--;
        o2.frequency--;
        if(o1.frequency>0)
             pq.offer(o1);
        if(o2.frequency>0)
            pq.offer(o2);

    }



    if  (pq.size() == 0){
        return res;
    }

    else if (pq.size() == 1) {

        Pair last = pq.poll();
        if ( last.frequency == 1) {

             res+= last.character;

             return res;

        }
        
    }


    return "";










        
    }
}