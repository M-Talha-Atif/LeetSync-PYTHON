class Solution {
    public int majorityElement(int[] nums) {
        int totalNumbers = nums.length;
        int half = totalNumbers / 2;
        HashMap<Integer, Integer> frequency = new HashMap<Integer, Integer>();

        for ( int num : nums ) {
              frequency.put( num, frequency.getOrDefault(num,0) + 1);
              if ( frequency.get(num) > half ) return num;
        }

        return -1;
        
    }
}