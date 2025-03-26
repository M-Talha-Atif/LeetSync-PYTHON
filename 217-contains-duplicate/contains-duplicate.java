class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> data = new HashSet<Integer>();
        for (Integer i : nums) {
            if (data.contains(i)){
                return true;
            }

            else{
                data.add(i);
            }
                
        }
        return false;
        
    }
}