class Solution {
    public int countLargestGroup(int n) {

       HashMap<Integer, List<Integer>> data = new HashMap<>();
       int maxLength = 0;

       int count = 0;

       for(int num=1; num<=n; num+=1){
        int key = returnSum(num);
        data.computeIfAbsent(key, k -> new ArrayList<>()).add(num);
        // count max length, a list having most elements
        maxLength = Integer.max(data.get(key).size(),maxLength);
       }

    // max frequency counting
      for (List<Integer> val : data.values())  {

        if(val.size() == maxLength){
            count +=1;
        }

      }

      return count;


        
    }

    public int returnSum(int num){

        int total = 0;

        while(num > 0) {
            int dig = num % 10;
            total += dig;
            num/=10;
        }

        return total;
    }
}