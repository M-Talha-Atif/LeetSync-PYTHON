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
        // search space define
        int left = 1;
        int right = n;
        // define the search space
        while ( left < right){
            int mid = left + ( right - left ) / 2; 
            int result = guess(mid);
            if (result == 0){
                return mid;
            }
            else if ( result == -1){
                // reduce search space from right side
                
                 right = mid;
            } 
            else {
              left = mid + 1;
            }

        }

        return left;

        
    }
}