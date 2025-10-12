class Solution {
    public int climbStairs(int n) {
        // you can take one step 
        // you can take two steps
        // n
        if (n==0 || n==1){
            return 1;
        }
        int prev=1;
        int prev1=1;
        int total = 0;
        for ( int i=1; i<n; i++){
            total = prev + prev1;
            prev = prev1;
            prev1 = total;
        }
        return total;

    }
// 0 -> 1

// 1 -> 1

// 2 -> 2 | depends on 0 and 1

// 3 -> 3 | depends on 2 and 1

// 4 -> 5 | depends on 3 and 2
}