class Solution {
    public int totalFruit(int[] fruits) {

        // a sub array to be picked
        // length of picked sub array is answer
        // may be using a set to hold the items and then removing from it
        // 1,2 | 2,3
        Map<Integer, Integer> storing = new HashMap<>();
        int left=0, right = 0;
        int n = fruits.length-1;
        int length = 0;
        while ( right <= n){
            storing.put( fruits[right], storing.getOrDefault(fruits[right],0)  + 1);
            while ( storing.size() > 2 ){
                // decrease frequency by 1
                storing.put( fruits[left], storing.get(fruits[left])  - 1);
                storing.remove( fruits[left], 0 ); // if frequency zero then remove
                left++;
            }

            length = Math.max( length, right - left + 1);
            right+=1;

        }

        return length;
        
    }
}