class Solution {
    public boolean judgeSquareSum(int c) {

        // two numbers a,b | a*a | b*b equals c
        // left = 0
        // right = square root of c
        // in this problem, we have to see maximum ending element
        // max(a,b) is the end? what can be same end for c
        // may be c/2?
        // may be c-10?
        // so shrinking the range so that we can traverse
        // as i see if use the number 3 that is greater than
        // a*a + b*b is c

        int left = 0;
        int right = (int) Math.sqrt(c);

        if ( right * right == c){
            return true; // first hand check for zero
        }

        while ( left <= right ){
              int a1 = left*left;
              int a2 = c - right*right;
              if ( a1 == a2){
                return true;
              }
              else if ( a1 > a2 ){
                right-=1;
              }
              else {
                left+=1;
              }
        }

        return false;
        
    }
}