class Solution {
    // do maths
    public int minSteps(int n) {
        // 4 --> 2
        // steps are 2 now
        // 2/3
        if (n == 1) return 0;
        int steps = 0;
        int fact = 2;
        while (n>1)
        {
            while ( n%fact == 0){
                steps+=fact;
                n/=fact;
            }
            fact+=1;
        }
        return steps;
        
    }
}