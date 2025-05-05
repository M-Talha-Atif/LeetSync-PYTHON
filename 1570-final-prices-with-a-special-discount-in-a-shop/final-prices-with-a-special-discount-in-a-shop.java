class Solution {
    public int[] finalPrices(int[] prices) {

        class Pair {
            int key;
            int value;

            Pair (int key, int value){
                this.key = key;
                this.value = value;
            }
        }

        // next smaller element
        // 8, 4
        // 8 -> 4
        // 4,6
        // 6 -> 2, 4 -> 2
        Stack<Pair> stack = new Stack<Pair>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0; i<prices.length; i+=1 ){
            int price = prices[i];
            while(!stack.isEmpty() && stack.peek().key >= price){
                Pair popped = stack.pop();
                map.put( popped.value , price);
            }
            
            stack.push(new Pair(price,i));
        }

        for(int i=0; i<prices.length; i+=1){

            prices[i] =  prices[i]  - map.getOrDefault( i,0);
        }

        return prices;

        
        
        
    }
}