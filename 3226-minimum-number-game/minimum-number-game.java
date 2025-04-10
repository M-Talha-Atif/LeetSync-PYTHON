class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue <Integer> data = new PriorityQueue <Integer>();
        for(int n  : nums){
            data.add(n);
        }
        List<Integer> res = new ArrayList<>();
        while(!data.isEmpty()){
            int a = data.poll();
            int b = data.poll();
            res.add(b);
            res.add(a);
        }

        return res.stream().mapToInt(Integer::intValue).toArray();

        
    }
}