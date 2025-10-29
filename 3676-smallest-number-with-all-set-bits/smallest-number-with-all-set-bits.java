class Solution {
    public int smallestNumber(int n) {

        int[] arr = {1, 3, 7, 15, 31, 63, 127, 255, 511, 1023};

        for ( int num : arr){
            if (num >= n){
                return num;
            }
        }



        return arr[0];
        
    }
}