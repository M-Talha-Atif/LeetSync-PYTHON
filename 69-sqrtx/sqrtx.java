class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;
        // search space state is  that is 1 to n
        // 8 
        // 1,2,3,4,5,6,7,8
        // 4 -> mid
        // 1-4 search space
        // mid -> 2
        // 2 * 2 -> 4 < x
        // 1,2,3,4
        // 2,3,4 stop now as left and right will be at 2
        int left = 1;
        int right = x;
        int mid = -1;

        while (left < right){
            mid = left + (right - left) / 2;
            System.out.println(mid);
            int target = mid * mid;
            if ( (long) mid * mid > (long) x){
                right = mid;
            }
            else if ( target == x ){
                return mid;
              
            }
            else {
                left = mid + 1;
            }

        }
        
        return (long)right*right > (long)x ? right - 1 : right;
    }
}