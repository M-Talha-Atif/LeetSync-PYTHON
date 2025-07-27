class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();
        int[] resultIndexes = new int[2];
        // 2,7

        for( int i=0; i<nums.length; i+=1 )
        { 
            int n = nums[i];
            int check = target - n;
            // -1 because 0 to n filled by indexes
            int fetched = data.getOrDefault(check,-1);
            if ( fetched != -1  ){
               resultIndexes [0] = fetched;
               resultIndexes [1] = i;
               return resultIndexes ;
            }
            data.put( n,  data.getOrDefault(n,i)  );


        }

        return resultIndexes ;
        
    }
}