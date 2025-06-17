class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {

        List<List<Integer>> result = new ArrayList<>();

        Map<Integer, List<Integer> > data = new HashMap<>();
        int n = groupSizes.length;

        for(int i=0; i<n; i++){
            int group = groupSizes[i];

            if (  data.containsKey(group)  ) {
                List<Integer> temp = data.get(group);
                temp.add(i);

                data.put(group ,   temp  );

            }
            else {
                List<Integer> temp =   new ArrayList<>();
                temp.add(i);

                data.put(group , temp  );
            }


        }

        System.out.println(data);

        data.forEach(
            (group,value) -> {
                List<Integer> temp =   new ArrayList<>();
                int count = 0;
                for( int i=0; i<value.size(); i++ ) {
                    // empty the list, one group done
                    if ( group == count){
                        result.add( new ArrayList<>(temp) );
                        count=0;
                        temp =   new ArrayList<>();
                    }
                    count+=1;
                    temp.add( value.get(i) );
                    
                }
                result.add( new ArrayList<>(temp) );
            }
        );

        return result;
       
        
    }
}