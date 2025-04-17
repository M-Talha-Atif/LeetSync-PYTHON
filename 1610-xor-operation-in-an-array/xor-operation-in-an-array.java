class Solution {
    public int xorOperation(int n, int start) {

        int answer = start;

        for (int index=1; index<n; index+=1){
            answer = answer ^ (start + 2 * index);
            }
        return answer;
        
    }
}