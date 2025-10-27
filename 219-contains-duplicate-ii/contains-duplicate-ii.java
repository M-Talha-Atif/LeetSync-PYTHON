class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for ( int i=0; i<nums.length; i++){
            int index = map.getOrDefault(nums[i],-1);
            if ( index!=-1 && Math.abs(i-index) <= k ){
                return true;
            }
            map.put(nums[i],i);
        }

        return false;


        
    }
}