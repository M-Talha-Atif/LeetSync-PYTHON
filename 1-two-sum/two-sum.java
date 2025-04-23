class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> frequency = new HashMap<>();
        int n = nums.length;

        // a + b = target 
        // target - a = b
        // target would be greater than a+b or either equals to a or b

        int[] result = new int[2];

        for(int index =0; index<n; index++){
            int current = nums[index];
            int checker = target - current;

            if(frequency.containsKey(  checker )){
                result[0] = frequency.get(checker);
                result[1] = index;
                break;
            }

 
            frequency.put( current, frequency.getOrDefault(current, index) );

        }

        return result;
        
    }
}