class Solution {
    public int longestSubarray(int[] nums) {
        // think of maximum element may be
        // first think about and operation
        // and with zero is zero, observation 1
        // and with same numbers stay same
        // and with differnet numbers stay less than the maximum among them
        // so may be finding an array having maximum element in it?
        // it means chosing only sub array having maximum element
        int maximum_elment  = -1;

        for (int n: nums){ // big o of n
            maximum_elment  = Math.max( maximum_elment , n);
        }
        // find sub array having only maximum elements
        // big o of n
        int temp_len = 0;
        int max_len = 0;
        
        for (int n: nums){ // big o of n
           if ( n == maximum_elment ){
                temp_len+=1;
           }
           else {
            // preserve already found length
              max_len = Math.max( max_len, temp_len);
              temp_len = 0; // reset to find new big length
           }
        }
        // loop ends without going to else so need to check again ---
        max_len = Math.max( max_len, temp_len);

        return max_len;

    }
}