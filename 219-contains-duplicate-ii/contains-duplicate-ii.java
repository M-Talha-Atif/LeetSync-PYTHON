class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();

        for(int i=0; i<nums.length; i++){
            int getIndex = data.getOrDefault(nums[i],-1);

            if(getIndex!=-1){
                int difference = Math.abs(getIndex -i);
                if (difference<=k){
                    return true;
                }
            }

            data.put(nums[i], i);

        }
        return false;
        
    }
}