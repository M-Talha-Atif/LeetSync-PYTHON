class Solution {
    public int numRescueBoats(int[] people, int limit) {
        // limit = 3

        // 1,2,2,3
        // 1,2, count+1
        // 3,3,4,5
        // 1,2,2,3 target = 7
        // 1,2,2,

        // current 1 boat
        // 
        Arrays.sort(people);
        // sit big people and see if space then pick small
        // if small can't fit, allocate seat 1 for right
        int boats = 0;
        int left =0, right = people.length-1;
     
        while(left <=right){

            int accomodate = people[left] + people[right];

            if (accomodate<=limit){
                boats+=1; // both small and big done
                left+=1; right-=1;
            }
            // can't fit small people so give seat to big one
            else {
                boats+=1; // big done
                right-=1;

            }
          
            
        }

        return boats;
        
    }
}