class Solution {
    public int shipWithinDays(int[] weights, int days) {
  
  
        int right = 0;
        int maxi = Integer.MIN_VALUE;
        for(int weight : weights){
            right+=weight;
            maxi = Math.max(maxi, weight);
        }
        int left = maxi;

        while (left < right ){
            int capacity = left + (right - left) / 2;
            // System.out.println("-----------"    );
            // System.out.println("-----------"    );

            // System.out.println("Capacity : " + capacity   );

            if ( checkCapacity(weights, days, capacity) == true ) {
                right = capacity;
            }
            else {
                left = capacity + 1;
            }
        }

        return left; // smaller capacity element always on left

        
    }

    public boolean checkCapacity(int[] weights, int days, int capacity){
       int curr = 0;
       days-=1;
      
       for(int weight : weights){
        //    System.out.println("Weight Element : " + weight   );
           curr += weight;
           if (curr > capacity){
            //   System.out.println("Current calculated : " + curr   );
              curr = weight;
              days-=1;

              if ( days < 0 ) return false;
           }
            
        }


        // System.out.println("Days calculated : " + days   );
        // System.out.println("-----------"    );
        // System.out.println("-----------"    );

        return days>=0;

    }
}