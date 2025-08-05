class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        // 4,2,5 -- 3,5,4
        int count =0;

        for (int i=0; i<fruits.length; i++){
            boolean placed = false;

            for (int j=0; j<baskets.length; j++){

                if (baskets[j]>= fruits[i]){
                    baskets[j]=-1;
                    placed = true;
                    break;
                }
            }
            if (placed == false){
                count+=1;
            }
        }

        return count;

        
    }
}