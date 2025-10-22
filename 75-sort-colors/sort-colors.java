class Solution {
    public void sortColors(int[] nums) {
        int countZeros=0, countOnes=0, countTwos=0;

        for ( int n : nums){
            if ( n  == 0){
                countZeros+=1;
            }
            else if ( n  == 1){
                countOnes+=1;
            }
            else {
                countTwos=0;
            }
        }
         for (int i = 0; i < nums.length; i++) {
            if (i < countZeros) nums[i] = 0;
            else if (i < countZeros + countOnes) nums[i] = 1;
            else nums[i] = 2;
        }
    }
}