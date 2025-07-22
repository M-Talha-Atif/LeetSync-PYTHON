class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        // k adjacent flowers
        // number of days
        int n = bloomDay.length;
        if (((long )m * k) > n) return -1;
        // no of days to be found, minimum case
        // search space -> minimum of day, maximum of day
        int left = 1000000;
        int right = -1;
        for ( int day : bloomDay){
            left = Integer.min( day, left );
            right = Integer.max( day, right );
        }
        // right is like 12
        // if asnwer is 12 then it will not go to search function
        // because left < right and right will be our answer
 
        while ( left < right )
        { 
            int targetDay = left + (right - left ) / 2;
            boolean result = checkAdjacent( bloomDay, m,  k, targetDay);

            if ( result == true){
                right = targetDay; // keep going to find minimum day
            }
            else {
                left = targetDay + 1;
            }

        }

        return right;

        
    }
    public boolean checkAdjacent( int[] bloomDay, int m, int k, int target){
        int count = 0;
        int pair = 0; // pair
        for ( int i=0; i<bloomDay.length; i+=1 )
        {
            int day = bloomDay[i];
            if ( day <= target){
                count+=1;
                // a multiple of 3
                if ( count % k == 0) {
                    pair+=1;
                }
            }
            else {
                count = 0;
              
            }
        }
        // System.out.println(target);
        // System.out.println(pair);
        // System.out.println(m);

        return pair >= m;


    }
}