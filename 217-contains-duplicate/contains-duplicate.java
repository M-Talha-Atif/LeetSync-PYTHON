class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> data = new HashSet<Integer>();

        for( int n: nums){
            if ( data.contains(n) ){
                return true;
            }
            data.add(n);
        }

        return false;
    }
}