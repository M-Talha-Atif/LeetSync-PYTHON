class Solution {
    public String frequencySort(String s) {
           Map<Character,Integer> data = new TreeMap<>();

           for (Character c : s.toCharArray())  {
            // frequency counter
              data.put  (  c,   data.getOrDefault(c,0)  +  1 ) ;
           }
           List<Character> [] bucket = new List[s.length() + 1];

            data.forEach((key, value) -> {
                // value -> frequence
                // key -> character
     
                if (bucket[value] == null){
                    bucket[value] = new ArrayList();
                }
         
                bucket[value].add(key);
                

           }  
           );


           StringBuilder object = new StringBuilder();
           
           for (int i= bucket.length -1 ; i>=0; i--){
               if (bucket[i]!=null){

                for (char c : bucket[i]){
                    for(int m=0; m<i; m+=1){
                          object.append(c);

                    }
                       
                }

            }
           }

           return object.toString();
    }
}