class Solution {
    public int maximumCount(int[] nums) {
        int cn = 0, zeros = 0;
        int length = nums.length;
        for (int n : nums) {
            if (n > 0) break;
            else if (n==0){
                zeros+=1;
            }
            else if (n<0){
                cn+=1;
            }  
            
        }
        return Math.max(cn,  length - cn - zeros);
    }
}
