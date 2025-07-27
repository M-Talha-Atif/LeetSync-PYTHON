class Solution {
    public boolean containsDuplicate(int[] nums) {
        // xor operator
        // 1^1, 0^0 == 0
        // Space Complexity = Auxiliary Space + Input Space
        // Time Complexity = running time of a program depending on input size
        
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