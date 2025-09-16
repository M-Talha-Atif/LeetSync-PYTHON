class Solution {
    // if strings then think about length of strings for gcd
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";
        int gcdLen = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLen);
    }

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}