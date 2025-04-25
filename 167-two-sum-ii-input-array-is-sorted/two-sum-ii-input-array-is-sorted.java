class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> counter =  new HashMap<Integer,Integer>();
        int[] arr = new int[2];

        for(int index=0; index<numbers.length; index++){
            int num = numbers[index];
            int diff = target - num;
            int retrievedIndex = counter.getOrDefault(diff,-1);
            if( retrievedIndex!=index &&  retrievedIndex  != -1){
                arr[0] = retrievedIndex+1;
                arr[1] = index+1;
                return arr;
            }

            counter.put(num, counter.getOrDefault(num,index));
        }

        return arr;
        
    }
}