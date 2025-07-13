class Solution {
    public int maximumCount(int[] nums) {
        // we can use binary search twice or thrice in case of count
        int length = nums.length;
        // finding positive number using target
        int left = 0;
        int right = length - 1;

        int cn = binarySearch( left, right, nums, 0);
        System.out.println(cn);
        int cp = binarySearch( left, right, nums, 1);
        System.out.println(cp);

        // if ( cp==cn && cp==0) return 0;
       
        return Math.max( cn, length - cp);
    }
    // >=0 for negative
    // >=1, for positive


    public int binarySearch( int left, int right, int[] nums, int comparison){
         while (left <= right){
            int mid = left + ( right - left ) / 2;
            int target = nums[mid];
            if ( target >= comparison)
            {
                right = mid - 1;
            }
            else {
                left = mid +1;
            }
        }
        // if ( nums[left]==0 && comparison==1 ){
        //     return 0;
        // }
        return left;
    }
}
