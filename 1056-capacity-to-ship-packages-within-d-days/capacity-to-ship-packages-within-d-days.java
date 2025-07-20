class Solution {

    public static boolean canLoad ( int[] weights, int days, int capacity){
        // initial set day to 1 for first round of loading weights
        int countDays = 1;
        int countCapacity = 0;

        for(int weight : weights)
        {   countCapacity += weight;
            if ( countCapacity > capacity ) {
                 countCapacity = weight;
                 countDays+=1;
                 if ( countDays > days){
                    return false;
                 }
             }
            
        }

        return countDays <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        // total weight we can load maximum in one day
        // weight would be minimum to load all packages within 5 days
        // so weight to be search space
        // maximum can be minimum search space to load weights
        // capacity minimum -> maximum weight
        // capacity maximum -> sum of all weights
        int right = 0;
        int left = Integer.MIN_VALUE;
        for(int weight : weights){
            right+=weight;
            left  = Math.max( left , weight);
        }
        while ( left < right ){
            int mid =  left + (right - left) / 2;
            boolean result = canLoad(weights,days,mid);
            if ( result == false){
                // increase capacity
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }

        return right;  
    }
}