class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // brute force using two for loops
        // let's optimize it
        // add elements in the map with their index if it is found again take the
        // index of that element and check the difference
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