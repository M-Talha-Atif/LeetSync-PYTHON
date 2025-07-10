/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        // search space is 1 to n, sorted
        int left = 1;
        int right = n;
        // reduce search space accoridng to 1,-1,0

        while ( left < right ){
            int mid = left + (right - left) / 2;
            int target = guess(mid);

            if (target == 0){
                return mid;
            }
            else if (target == -1){
                // reduce search space from right
                right = mid;
            }
            else {
                // reduce search search space from left
                left = mid + 1;
            }

        }

        return right;

        
    }
}