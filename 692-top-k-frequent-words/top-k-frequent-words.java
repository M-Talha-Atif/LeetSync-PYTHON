class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        class Pair implements Comparable<Pair> {
            int frequency;
            String word;
            Pair (int frequency, String word){
                this.frequency = frequency;
                this.word = word;
            }
             @Override
    public int compareTo(Pair other) {
        return this.word.compareTo(other.word); 
    }
        }

        Map<String,Integer> data = new HashMap<String,Integer>();
        
        // looping over each word in list of words
        for(String word : words){
            data.put( word, data.getOrDefault(word,0) + 1 );
        }

        PriorityQueue<Pair> maxHeap = new PriorityQueue<Pair>(

            (a,b)
            -> {
                if (a.frequency==b.frequency){
                    return a.compareTo(b);
                }
                else {
                   return b.frequency - a.frequency;
                }
            }
        );

        List<String> res = new ArrayList<>();

        data.forEach(
            (word,freq) -> maxHeap.offer( new Pair(freq,word) )
        );

        while(k-->0){

            res.add( maxHeap.poll().word );
        }


        return res;

    }
}