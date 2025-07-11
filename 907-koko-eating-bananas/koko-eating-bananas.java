class Solution {
    // % for remaining bananas
    // / division for banans eat per hour
    // 3//3 , 6//3, 7//3 , 11//3
    // where divisor can be range from 1 to max value of piles
    public static boolean canEat(int[] piles, int k, int hours)
    {
            int countHours = 0;
            for(int pile : piles){
                int possibleHours = pile/k;
                int remaining = pile % k;
                if ( remaining > 0 ){
                    countHours+=1;
                }
                countHours += possibleHours;
            }

            return countHours <= hours;
    }

    public int minEatingSpeed(int[] piles, int h) {
        // 3,6,7,11
        // h=8
        // k -> range
        // k -> 3 -- 11
        // pile // k 
        // 3/3-> 1
        // 6/3 -> 2
        // 7/3 -> 3
        // 11/3 -> 4

        // search space is reduce on basis of true and false

        
        int left= 1;
        int right=0;
        for(int pile : piles){
            right = Math.max(right, pile);
        }
        while ( left < right ){
            int mid = left + (right - left) / 2;
            boolean result = canEat(piles, mid, h);
            // false k case m k increase
            if ( result == false ){
                left = mid + 1;
            }
            else {
                // in case of equal we look for minimum value
                right = mid;
            }
        }

        return right;


        
    }
}