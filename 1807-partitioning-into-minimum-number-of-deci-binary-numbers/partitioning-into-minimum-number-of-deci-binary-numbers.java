class Solution {
    public int minPartitions(String n) {
        int big = 1;
        for(char c : n.toCharArray()){
            int num = c - '0';
            if ( num > big ){
                big = num;
            }
            if (big == 9){
                break;
            }
        }

        return big;
        
    }
}