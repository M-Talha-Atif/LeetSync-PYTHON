class Solution {
    public String convertToTitle(int columnNumber) {
        // asci value is 65 starting
        // 26 are letters in english
        // when to divide , when to take mod
        String result = "";
        while ( columnNumber > 0){
            columnNumber -=1;
            result = (char) ( (columnNumber%26) + 65 )+ result;
            columnNumber/=26;
        }

        return result;
        
    }
}