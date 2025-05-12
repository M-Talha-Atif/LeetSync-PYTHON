class Solution {
    public int[] findEvenNumbers(int[] digits) {

        Map<Integer,Integer> counter = new HashMap<Integer,Integer> ();
        // counter digits
        int maxi = Integer.MIN_VALUE;
        for( int dig : digits){
            maxi = Math.max(maxi,dig);
            counter.put(dig, counter.getOrDefault(dig,0) + 1);
        }
        List<Integer> res = new ArrayList<Integer>();
        int end = (maxi+1) * 100;
        // System.out.println(end);

        for(int i=100; i<end; i++){
            if ( i % 2 == 0 )
            {
                Map<Integer,Integer> map = new HashMap<Integer,Integer> ();
                int temp = i;
                int secondTempi = i;
                while(temp>0){
                    int digi = temp % 10;
                    map.put(digi, map.getOrDefault(digi,0) + 1);
                    temp/=10;
                }

                boolean check = true;
                
                while   (secondTempi>0)   {
                    int digi = secondTempi % 10;
                    int a1 = counter.getOrDefault(digi,0);
                    int a2 = map.getOrDefault(digi,0);
                    if (a1>3){
                        a1=3;
                    }
                    if (a2 > 3){
                        a2=3;
                    }

                    int diff = a1 - a2;

                    if ( diff<0 || diff == a1) {
                      check = false;
                      break;
                    }
                    secondTempi/=10;
                }

                // System.out.print("------------");
                // System.out.println(map);
                // System.out.println(counter);
                // System.out.print("------------");

                if (check){

                    res.add(i);

                }

            }


        }

        return res.stream().mapToInt(Integer::intValue).toArray();

        
    }
}