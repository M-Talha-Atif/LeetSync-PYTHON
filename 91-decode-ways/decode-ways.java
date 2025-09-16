class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] d = new int[n+1];

        if (n==0) {
            return 0;
        }

        int[] number = new int[n+1];
        for(int i = 0; i < n; i++) {
            number[i+1] = s.charAt(i) - '0';
        }

        d[0] = 1;
        d[1] = number[1] != 0 ? 1 : 0;

        for(int i = 2; i <= n; i++) {
            if (number[i] != 0) {
                d[i] = d[i] + d[i-1];
            }
            int lastTwoDigits = number[i-1]*10 + number[i];
            if (lastTwoDigits<= 26 && lastTwoDigits>=10) {
                d[i] = d[i] + d[i-2];
            }

            // System.out.println(number[i] + " --- " + lastTwoDigits + " --- " + d[i]);
        }
        return d[n];
    }
}