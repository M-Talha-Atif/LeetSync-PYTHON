class Solution {
    public boolean doesAliceWin(String s) {

        
        for (char c: s.toCharArray()){
            if ( c=='a' || c=='e' || c=='o' || c=='i' || c=='u'){
                return true;
            }
        }
        return false;
        
    }
}