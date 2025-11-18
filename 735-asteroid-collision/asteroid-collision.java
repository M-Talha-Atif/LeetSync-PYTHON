class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> data = new Stack<Integer>();
        // element negative then ap stack se nikalo
        data.push(asteroids[0]);
        
        int n = asteroids.length;

        // All is about IF ELSE

        for( int i=1; i<n ; i+=1)
        { 
            if ( asteroids[i] < 0) 
            {

                    // ast is postive so its same numbers will be less than like negative

                     if( data.isEmpty() ){
                         data.push(asteroids[i]); // negative along with negative numbers
                         continue;
                    }


                    if( !data.isEmpty() && data.peek() < 0 ){
                        data.push(asteroids[i]); // negative along with negative numbers
                        continue;
                
                    }

                   

                    int ast = -asteroids[i];

                    if( !data.isEmpty() &&  data.peek() == asteroids[i] ){
                        data.pop();
                        continue;
                    }
                     
                    

                  

                   
                    

                    // handling numbers less than negative number
                    while ( !data.isEmpty() && data.peek()>0 && data.peek() < ast ) {
                        data.pop();
                    }

                    if( data.isEmpty()  || data.peek() < 0 ){
                         data.push(asteroids[i]); // negative along with negative numbers
                
                    }

                      // equal numbers
                    if( !data.isEmpty() &&  data.peek() == ast ){
                        data.pop();
                        continue;
                    }




                   

                }

                 else {
                data.push(asteroids[i]);
            }

            } 

              System.out.println(data);

        int[] arr = new int[data.size()];
        for (int i = 0; i < arr.length; i++) {
             arr[i] = data.get(i); // Direct access without popping
        }

        while(!data.isEmpty()){
            data.pop(); // free memory
        }

        return arr;
           
        
        }

      

}
