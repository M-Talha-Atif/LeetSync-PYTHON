public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1)
            return "";
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // 1. Odd length ke palindromes ke liye (centre: i)
            int len1 = expand(s, i, i);
            // 2. Even length ke palindromes ke liye (centre: i & i+1 ke beech)
            int len2 = expand(s, i, i + 1);

            int maxLen = Math.max(len1, len2);

            // Agar naya palindrome bada mila toh apna answer update karo
            if (maxLen > end - start) {
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    // Yeh helper function actual expansion karta hai
    private int expand(String s, int left, int right) {
        // Jab tak pointers boundary mein hain aur characters match kar rahe hain, tab tak expand karo
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Actual length of the palindrome
        return right - left - 1;
    }
}