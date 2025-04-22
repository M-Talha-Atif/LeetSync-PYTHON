class Solution {
    public int majorityElement(int[] nums) {
        // using hashmap
        int n = nums.length;
        Map<Integer, Integer> counter = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            counter.put(nums[i], counter.getOrDefault(nums[i], 0) + 1);
        }
        
        n = n / 2;

        for(Map.Entry<Integer, Integer> f : counter.entrySet()){
            if (f.getValue()>n)
            return f.getKey();
        }

        return 0;
        
    }
}