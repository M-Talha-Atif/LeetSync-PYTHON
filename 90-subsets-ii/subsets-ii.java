class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

     List<List<Integer>> data = new ArrayList<>();
     Arrays.sort(nums);


        backTrack(data,new ArrayList<>(),nums, 0);

        return data;


        
    }

       private void backTrack(List<List<Integer>> data, List<Integer> temp, int[] nums, int start){
        data.add(new ArrayList<>( temp ));

        for(int i=start; i<nums.length; i+=1){
            if( i>start && nums[i-1] == nums[i]) continue;
            temp.add(nums[i]);

            backTrack(data, temp, nums, i + 1);

            temp.remove( temp.size() - 1 );
        }
    }
}