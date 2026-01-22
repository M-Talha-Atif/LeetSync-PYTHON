class Solution {
    public void rotate(int[] nums, int p) {
        // reverse technique

    
        int n = nums.length;
        int k = p % n; 
        reverse(nums, 0, n-1); // full reverse
        reverse(nums, 0, k-1);  // upto k-1 reverse
        reverse(nums, k, n-1); // k upto n reverse

        
    }
    public static void reverse(int[] nums, int left, int right){
        while(left<right){
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--]  = temp;
        }

    }
}