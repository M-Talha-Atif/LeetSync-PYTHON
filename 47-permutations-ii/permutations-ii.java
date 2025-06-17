class Solution {

    // An array to track either a number is visited or not
    List<List<Integer>> result ;

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums); // to skip duplicates
        result  = new ArrayList<>();
        // call the function
        int n = nums.length;

        solve(new ArrayList<>(), nums, nums.length, new boolean[n] );

        return result;



    }

    public void solve(List<Integer> temp, int[] nums, int n, boolean used[]){
        if ( temp.size() == n )
        {
            result.add(new ArrayList<>( temp ));

            return;
        }

        for(int i =0; i < n ; i++){

            if( used[i] || i>0 && nums[i] == nums[i-1] && used[i-1] ){
                continue;
            }

            temp.add(nums[i]); // take
            used[i] = true;
            solve(temp,nums,n,used); // explore
            used[i] = false;
            temp.remove( temp.size() - 1); // prune and explore again
        }

    }
}