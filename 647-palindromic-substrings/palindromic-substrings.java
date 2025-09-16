class Solution {
    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            // 1. Odd length ke palindromes ke liye (centre: i)
            count += expand(s, i, i);
            // 2. Even length ke palindromes ke liye (centre: i & i+1 ke beech)
            count += expand(s, i, i + 1);
        }
        return count;
    }

    private int expand(String s, int left, int right) {
        int localCount = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            localCount++; // Har successful expand pe ek naya palindrome mil gaya!
            left--;
            right++;
        }
        return localCount;
    }
}