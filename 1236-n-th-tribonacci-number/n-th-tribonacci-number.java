class Solution {
    public int tribonacci(int n) {
        // 3 base cases numbers that is 0, 1 , 1
        // can be solved using for loop, without map

        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        int a = 0, b = 1, c = 1;
        for (int i = 3; i <= n; i++) {
            int next = a + b + c;
            // resule change now
            // 0, 1 , 1 = 2
            // 1, 1, 2 = 4
            // just excchange variables
            a = b;
            b = c;
            c = next;
        }
        return c;

    }

   
}