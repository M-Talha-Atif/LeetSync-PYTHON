
        // goal is to keep the index and value of temperature in the data structure
        /// so why not queue, queue is fifo
        // so stack is lifo
    class Solution {
    class Pair {
        Integer key;
        Integer value;

        Pair(Integer key, Integer value) {
            this.key = key;
            this.value = value;
        }
    }
    // Don't use numbers as a key
    // Use index as a key

    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Pair> stack = new Stack<Pair>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int n  = temperatures.length;

        for(int i =0;  i <  n; i +=1) {
            int temp = temperatures[i];

            while (!stack.isEmpty() && stack.peek().key < temp ){
                Pair popped = stack.pop();
                int poppedKey = popped.key;
                int poppedIndex = popped.value;
                int distance = i - poppedIndex;
                map.put( poppedIndex, distance);
            }

            stack.push( new Pair(temp,i));
        }

        for(int i=0; i<n ; i+=1){
            temperatures[i] = map.getOrDefault(i , 0);
        }

        return temperatures;
        
    }
}

// 73, 74

// 73, 74
// 73 -> i - value
// 74 ->

// 73 
        
 