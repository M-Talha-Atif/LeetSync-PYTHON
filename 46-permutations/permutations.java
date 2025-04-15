class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
         List<List<Integer>> data = new ArrayList<> ();
         backTrack(data, new ArrayList<>(),nums);

         return data;
    }

      private void backTrack(List<List<Integer>> data, List<Integer> temp, int[] nums){
        if(temp.size() == nums.length){
            data.add(new ArrayList<>( temp ));
        }
        else {

            for(int i= 0; i<nums.length; i+=1){
            if( temp.contains(nums[i])) continue;

            temp.add(nums[i]);

            backTrack(data, temp, nums);

            temp.remove( temp.size() - 1 );
        }
        }
           

     
    }
}