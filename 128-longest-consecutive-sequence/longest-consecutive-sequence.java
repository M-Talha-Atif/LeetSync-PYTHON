class Solution {
    public int longestConsecutive(int[] nums) {
        if ( nums.length == 0) return 0;
        // have a set to check if elements exists in the set
        HashSet<Integer> checker = new HashSet<Integer>();
        // Loop over each element
        for ( int n : nums){
            checker.add(n); // add in set  , Big O(1)
        }

        int longest = 1;
        for ( int n : checker){
            if ( checker.contains(n-1) == false ) {
                int num = n+1;
                int sequence = 1;
                 while ( checker.contains(num) ){
                        sequence+=1;
                        num+=1; // element present
                }
                longest = Math.max( longest, sequence);
            }
           
        }

        return longest;
        

        
        
    }
}