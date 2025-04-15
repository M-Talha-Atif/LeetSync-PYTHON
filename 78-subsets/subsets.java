class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> data = new ArrayList<>();


        backTrack(data,new ArrayList<>(),nums, 0);

        return data;
        
        
    }
    private void backTrack(List<List<Integer>> data, List<Integer> temp, int[] nums, int start){
        data.add(new ArrayList<>( temp ));

        for(int i=start; i<nums.length; i+=1){
            temp.add(nums[i]);

            backTrack(data, temp, nums, i + 1);

            temp.remove( temp.size() - 1 );
        }
    }
}