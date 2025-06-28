class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        class Pair {
            private int value;
            private int index;
            Pair(int value, int index){
                this.value = value;
                this.index = index;
            }
            public int getValue() {
                 return value;  }

            public int getIndex() {
                    return index;}
 }
        int n =  nums.length;

        Pair[] result = new Pair[n];
        
        for(int i=0; i<n; i++){
            result[i] = new Pair(  nums[i] , i );
        }

    Arrays.sort(result, (a, b) -> a.getValue() - b.getValue());

    System.out.println(result);
    
    // 1. Take last k elements
    Pair[] lastK = Arrays.copyOfRange(result, result.length - k, result.length);

    Arrays.sort(lastK , (a, b) -> a.getIndex() - b.getIndex());
    
    int[] res = new int[k];
    for (int i=0; i<k; i++){
        res[i] = lastK[i].getValue();
    }

    return res;
        
    }
}