class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> indices = new ArrayList<>();
        int i = 0;
        for (String word : words){

            if (word.contains(String.valueOf(x))){
                indices.add(i);

            }
            i+=1;
        }

        return indices;
        
    }
}