class Solution {
    public int[] twoSum(int[] nums, int target) {
        // nested loop big o of n^2
        // hashmap big o of n
        // key is index
        // a+b = target, target - b = a, target - a = b
        HashMap<Integer,Integer> visited = new HashMap<>();

        for ( int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if ( visited.containsKey(complement) ) {
                return new int[]{ visited.get(complement) , i };
            }
            visited.put( nums[i], i);
        }

        return new int[]{};
        
    }
}