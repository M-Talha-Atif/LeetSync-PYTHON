class Solution {
    /* 
Recursive calls:
Each call will get its copy of temporary list and also of start
1 -> 1,2, -> 1,2,3 | start =0, start = 1, start = 2
1 -> 1,3, -> 1,3 |  start =0, start = 2
2 ->  2,3 | start =1, start = 2

    */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
   
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
        list.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }

}