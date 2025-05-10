class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n = piles.length;
        int left = 1;
        int right = piles[n-1];

        while ( left < right ) {

            int mid = left + (right - left ) / 2;

            int getAns = giveAnswer(piles, h, mid);

        

            if ( getAns > h){
                left = mid + 1;
            }
    
            else {
              
                right = mid ;
            }

        }


        return left;

        
    }

    public int giveAnswer(int[] piles, int h, int k){
        int total = 0;
        for(int pile : piles){
            int div = (pile/k);
            if ( pile % k != 0){
                total+=1;
            }
            total += div;
        }

        

        return total;

    }
}