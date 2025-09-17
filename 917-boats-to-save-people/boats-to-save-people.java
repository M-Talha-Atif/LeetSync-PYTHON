class Solution {
    public int numRescueBoats(int[] people, int limit) {

        // sorting + moving pointers
        // how to do pairing
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int boats = 0;
        while (left <= right){
            int remaining = limit - people[right];
            if ( remaining  ==  0){
                right-=1;
            }
            else if ( remaining  >  0 && remaining - people[left] >=0 ){
                right-=1;
                left+=1;
            }
            else {
                right-=1;
            }
            boats+=1; 
        }
        // 1,2,2,3
        // 3, right is now at 2
        // 1,2,2
        // 

        return boats;
        
    }
}