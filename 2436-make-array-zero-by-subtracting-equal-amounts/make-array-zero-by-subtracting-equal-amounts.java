class Solution {
    public int minimumOperations(int[] nums) {

        HashSet<Integer> data = new HashSet<Integer>();
        int subtract=-1;

        for(int n : nums){
            if(n>0){
                data.add(n);
            }
        }

        return data.size();
        
    }
}