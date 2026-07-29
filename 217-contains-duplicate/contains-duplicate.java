class Solution {
    public boolean containsDuplicate(int[] nums) {
        // brute force approach would be nested loop that would be Big O( n^2 )
        HashSet<Integer> alreadyVisited = new HashSet<>();
        for ( int num : nums){
            if ( alreadyVisited.contains(num)){
                    return true;
            }
            alreadyVisited.add(num);
        }

        return false;
        
    }
}