class Solution {
    public int[] twoSum(int[] numbers, int target) {

        // two pointers
        // left - right 
        // 2, 15 = 17 , right minus
        // 2 , 11 = 13, right minus
        // 2,7 = 9 ok ay, right minus
        // big O(n) - in case on pointer is getting decreased
        int left = 0;
        int right = numbers.length - 1;
        // same number can't be used so <
        while ( left < right ) {
            int total = numbers[left] + numbers[right];
            if ( total > target ) {
                right -= 1;
            }
            else if ( total == target ){
                return new int[] {left+1, right+1};
            }
            else {
                left+=1;
            }
        }

        return new int[] {left+1, right+1};
        
    }
}