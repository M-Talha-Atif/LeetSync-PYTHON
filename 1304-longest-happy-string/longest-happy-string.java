class Solution {
    public String longestDiverseString(int a, int b, int c) {

        // 7,1,1
        // pop top two
        // if >=2 then add character two times else 1 time

         class Pair {
            int frequency;
            char character;
            Pair (int f, char c){
                this.frequency = f;
                this.character = c;
            }
        }

     

        // Priority Queue
    PriorityQueue<Pair> pq = new PriorityQueue<Pair>(

            (a1,b1) -> b1.frequency - a1.frequency
        );






    Pair object;

    if (a>0){
        object = new Pair(a, 'a');
        pq.offer( object );
    }

    if (b>0){
        object = new Pair(b, 'b');
        pq.offer( object );
    }
    if (c>0){
        object = new Pair(c, 'c');
        pq.offer( object );
    }

   


    String res = "";


    while( pq.size() > 1){

        Pair o1 = pq.poll();
        Pair o2 = pq.poll();
        

        if(o1.frequency>=2){

            res+= o1.character;
            res+= o1.character;
         
            o1.frequency--;
            o1.frequency--;
            

        }
        else {

            res+= o1.character;
            o1.frequency--;


        }


        if(o2.frequency>=2 && o2.frequency>=o1.frequency){

            res+= o2.character;
            res+= o2.character;
         
            o2.frequency--;
            o2.frequency--;
            

        }
        else {

            res+= o2.character;
            o2.frequency--;


        }

        if(o1.frequency>0)
            pq.offer(o1);
             
        if(o2.frequency>0)
            pq.offer(o2);

    }

    if (pq.isEmpty()){
        return res;
    }

    Pair o1 = pq.poll();

    if(o1.frequency>=2){

            res+= o1.character;
            res+= o1.character;

    }
    else {

            res+= o1.character;
    }

    

    return res;
        
    }
}