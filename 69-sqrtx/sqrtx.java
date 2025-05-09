class Solution {
    public int mySqrt(int x) {
        // For special cases when x is 0 or 1, return x.
        if (x == 0 || x == 1)
            return x;

        int left = 1;
        int right = x;
        int mid = -1;


        while (left <= right){

             mid =  left + (right - left) / 2;

            // System.out.println("Mid value: " + mid);
            int target = mid * mid;
           

            if (  (long) mid * mid > (long) x ){
                  right = mid - 1;
            }
            else if ( target ==  x){
                return mid;
            }
            else {
                left = mid + 1;
            }


        }

        return right;
        
    }
}