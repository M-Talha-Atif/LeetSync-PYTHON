class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder data = new StringBuilder();

        int a1 = word1.length();
        int a2 = word2.length();

        int length = Math.min(a1,a2);

        for(int i=0; i<length;i+=1){
            data.append(word1.charAt(i));
            data.append(word2.charAt(i));
        }

        if(a1>a2){
            for(int i=length; i<a1; i++){
                data.append(word1.charAt(i));
            }
        }
        else if(a2>a1){

             for(int i=length; i<a2; i++){
                data.append(word2.charAt(i));
            }
        }

        



        return data.toString();
        
    }
}