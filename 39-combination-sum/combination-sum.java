class Solution {
    // same subsets  problem but just one condition for sum then add in result
    // just pick number again, instead of i+1, use i
    // deduct target by number chose, if  target 0 add in result
  
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       
        int n = candidates.length;

        Arrays.sort(candidates);

        return solve(candidates, target, n, 0, new ArrayList<>() , new ArrayList<>() );
        
    }

    public List<List<Integer>>  solve(int[] candidates, int target, int n, int start, List<Integer> temp, List<List<Integer>> result){


        // System.out.println(temp);

        if ( 0 == target){
             result.add( new ArrayList<>(temp));
             return result;
        }

          for(int i=start; i<candidates.length; i+=1){

            if ( target - candidates[i] < 0 ) return result;

            temp.add(candidates[i]); // take

            // solve(  candidates, target, n, i + 1, temp); // process
            solve(  candidates, target - candidates[i], n, i , temp, result); // process

            temp.remove( temp.size() - 1 ); // remove again explore
        }

        return result;

    }
}