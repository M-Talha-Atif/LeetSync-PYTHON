class Solution {
    public int[] getNoZeroIntegers(int n) {

        int[] res = new int[2];
        for (int i=1; i<n; i++){
            if ( checkZero(n-i) && checkZero(i) && (i + (n-i) ) == n){
                res[0] = i;
                res[1] = n - i;
                return res;

            }
        }

        return res;
        
    }

    boolean checkZero( int num){
        while (num > 0){
            int dig = num % 10;
            if ( dig == 0) return false;
            num/=10;
        }

        return true;
    }
}