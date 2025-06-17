class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        int n = candidates.length;

        Arrays.sort(candidates);

        return solve(candidates, target, n, 0, new ArrayList<>() , new ArrayList<>());
        
        
    }

     public List<List<Integer>>  solve(int[] candidates, int target, int n, int start, List<Integer> temp, List<List<Integer>> result){


        // System.out.println(temp);

        if ( 0 == target){
             if (!result.contains(temp)){
                 result.add( new ArrayList<>(temp));
             }
            
             return result;
        }

          for(int i=start; i<candidates.length; i+=1){

            if ( target - candidates[i] < 0 ) return result;


            // no more duplicate combinations
            if ( i>start && candidates[i] == candidates[i-1] ) continue;

           

            temp.add(candidates[i]); // take

        

            // solve(  candidates, target, n, i + 1, temp); // process
            solve(  candidates, target - candidates[i], n, i + 1 , temp, result); // process

    

            temp.remove( temp.size() - 1 ); // remove again explore
        }

        return result;

    }
}