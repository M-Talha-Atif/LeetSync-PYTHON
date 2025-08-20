class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<>();
        backTrack( n, k, 1, new ArrayList<>() );
        return res;
        
    }
    public void  backTrack( int n, int k, int start, List<Integer> temp )
    {
        if ( temp.size() == k  ){
            res.add(  new ArrayList<>(temp) ); // add as a list with copy
            return;
            
        }
        for ( int i=start; i <=n; i++){

            temp.add( i ); // add

            backTrack( n, k, i+1, temp ); // explore 

            temp.remove( temp.size() - 1 ); // remvoe last option

        }
    }
}