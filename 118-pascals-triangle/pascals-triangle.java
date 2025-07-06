class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> data = new ArrayList<>();
        data.add(Arrays.asList(1));
        if (numRows == 1){
            return data;
        }
      
        for( int i=1; i<numRows; i++ ){ // as 1 added so start from 1
        List<Integer> temp = new ArrayList<>();
        // first one
        temp.add(1); 

        for ( int j=1; j<i; j++ ) {
            int res = data.get(i-1).get(j-1) + data.get(i-1).get(j);
            temp.add(res);
        }
        // last one
        temp.add(1);

        data.add(temp);

        }
        

        return data;
        
    }
}