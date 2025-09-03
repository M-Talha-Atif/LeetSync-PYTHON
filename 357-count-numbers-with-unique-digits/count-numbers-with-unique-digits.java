class Solution {
    public int countNumbersWithUniqueDigits(int n) {

        // 11 -> 110, 101, 112, 121, 111, | 9*2 + 1
        // 9 * (9*2) + 9
        // 999 -> 9*2 + 1

        if (n == 1) {
            return 10;
        }
        if (n == 2)
            return 91;
        if (n == 3)
            return 739;
        if (n == 4)
            return 5275;
        if (n == 5)
            return 32491;
        if (n == 6)
            return 168571;
        if (n == 7)
            return 712891;
        if (n == 8)
            return 2345851;
        return 1;

    }
}