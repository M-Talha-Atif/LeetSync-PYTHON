class Solution {

    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length())
            return false;

        int[] s1Freq = new int[26]; // frequence for s1
        int[] window = new int[26];


        // make frequency map
        for(char c : s1.toCharArray())
            s1Freq[c - 'a']++;

        int left = 0;
        
        // iterate over s2
        for(int right = 0; right < s2.length(); right++){

            window[s2.charAt(right) - 'a']++;

            // if size exceeds window size then remvoe one chractaer to  keep it to 
            // s1 size

            if(right - left + 1 > s1.length()){
                window[s2.charAt(left) - 'a']--;
                left++;
            }
            // compare frequencies are equal within given window or not

            if(Arrays.equals(s1Freq, window)){
                return true;
            }
        }

        return false;
    }
}