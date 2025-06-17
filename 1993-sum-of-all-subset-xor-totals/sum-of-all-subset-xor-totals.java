class Solution {

    List<List<Integer>> result;
    public int subsetXORSum(int[] nums) {

        result = new ArrayList<>();

           // take, explore, not take, explore
        solve(nums, 0, new ArrayList<>());

        int total = 0;

        for(List<Integer> items : result){
            int temp = 0;
            for (int item : items){
                temp ^= item;
            }
            total+=temp;
        }

        return total;

        
    }

    public void solve(int[] nums, int index, List<Integer> temp ){
        result.add(new ArrayList<>( temp ));

        for(int i=index; i<nums.length; i+=1){
            temp.add(nums[i]); // take

            solve(  nums, i + 1, temp); // process

            temp.remove( temp.size() - 1 ); // remove again explore
        }
    }
}