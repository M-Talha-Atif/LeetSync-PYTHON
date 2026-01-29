class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 1,2
        // 3 - 2
        // 1,2,2
        int a = m - 1; // for nums1
        int b = n - 1; // for nums2
        int c = m + n - 1; // 
        while ( b  >= 0 ) { // till my nums2 are all get processed
            if ( a >= 0 && nums1[a] > nums2[b] )
            {
                nums1[c--] = nums1[a--];

            }
            else {
                nums1[c--] = nums2[b--];
            }
            
        }

    }
}