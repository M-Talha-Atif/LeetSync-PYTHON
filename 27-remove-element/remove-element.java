class Solution {
    public int removeElement(int[] nums, int val) {
 
        int count = 0;
        int start = 0;
        int n = nums.length;

        // assign elements again from start if not equal to val

        for(int i=0; i < n ; i+=1){

            if ( nums[i]==val){
                count+=1;
            }
            else {

                nums[start++] = nums[i];

            }


        }

      return n - count;
        
    }
}