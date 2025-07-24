class Solution {
    public boolean isPerfectSquare(int num) {
        int x = num;

        // if ( x == 1 ) return false;

        int left = 1;
        int right = x;

        while (left <= right){

            int mid = left + (right - left) / 2;
            System.out.println(mid);

            // mid * mid is x so, mid / x is also mid and also mid is multiple of x , so x % mid should be zero
            int target = x / mid;
            int factor = x % mid;

            if ( factor == 0 && target == mid ){
                return true;
            }
            else if ( target > mid ){
                left = mid + 1;
                
            }
            else {
              right = mid - 1;
            }

        }

        return false;
        
    }
}