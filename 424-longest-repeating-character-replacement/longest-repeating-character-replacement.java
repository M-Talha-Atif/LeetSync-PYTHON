class Solution {
    public int characterReplacement(String s, int k) {
        // max will remain vaidated
        int[] count = new int[26];
        int n = s.length();

        int left = 0;

        int maxCount = 0;

        int lenght = 0;
        
        for (int right = 0; right<n; right+=1){

            maxCount = Math.max(maxCount, ++count[s.charAt(right) - 'A'] );
            int currLength = right - left + 1;

            if (currLength - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left+=1;

            }

            lenght = Math.max(lenght, right - left + 1);

        }

        return lenght;


        
    }
}