class Solution {
    // demanding a integer from sub array
    public int maxProduct(int[] nums) {
        int preFixProduct = 1;
        int suffixProduct = 1;
        int n = nums.length;
        // every element start and end could be answer/
        int res = -11;
        for (int i = 0; i < n; i++) { // outside loop

           if (preFixProduct == 0){
                preFixProduct = 1; // reset when zero comes
            }
            if (suffixProduct == 0){
                suffixProduct = 1; // reset when zero comes
            }
       
            suffixProduct *= nums[n-i-1]; // last element starting from right
            preFixProduct *= nums[i]; // first element starting from left
         
            res = Math.max( Math.max(suffixProduct,preFixProduct) , res);

        }

        return res;

    }
}