class Solution {
    public long countSubarrays(int[] nums, int k) {
        long maxi = getMax(nums);

        // for let say maximum element at least k 
        // increment the count of maximum by 1 at start of loop always


        long total = 0;
        long left=0;
        long right=0;
        long maxCount = 0;

        long n = nums.length;

        while (right < n)  {

            // increment maxcount
            if(nums[(int)right] == maxi) maxCount+=1;

            // decrement max count
            while( maxCount >=k ) {

                if( nums[(int)left] == maxi){
                    maxCount-=1;
                }   
                left+=1;

            }

            

            total += (right - left + 1);

            right+=1;

        }



        return (n * (n+1) / 2 ) - total;
    }

    public long getMax(int[] array){
        long max = Long.MIN_VALUE;
        for (int num : array) {
            max = Math.max(max, num);
            
        }
        return max;
    }
}