class Solution {
    List<List<Integer>> result;
    // Permutation m n size k mutabak list utahni subset se
    public List<List<Integer>> permute(int[] nums) 
    {
        result = new ArrayList<>();


        solve(nums,  new ArrayList<>() , nums.length);

        return result;
        
    }

    public void solve(int[] nums, List<Integer> temp , int n)
       {

        if (temp.size() == n){
            result.add(new ArrayList<>( temp ));
            return;
        }

        for(int i=0; i<nums.length; i+=1){

            if( temp.contains(nums[i])) continue;

            temp.add(nums[i]); // take

            solve(  nums, temp, n); // process

            temp.remove( temp.size() - 1 ); // remove again explore
        }
    }
}