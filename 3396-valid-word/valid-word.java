class Solution {
    public boolean isValid(String word) {
        // 1. Minimum 3 characters
        if (word.length() < 3) {
            return false;
        }

        boolean checkVowel = false;
        boolean checkConsonant = false;

        for (char c : word.toCharArray()) {
            // 2. Only English letters (uppercase/lowercase) or digits
            if (!(Character.isLetterOrDigit(c))) {
                return false;
            }

            // 3. Check for vowel
            if (!checkVowel && isVowel(c)) {
                checkVowel = true;
            }

            // 4. Check for consonant
            if (!checkConsonant && Character.isLetter(c) && !isVowel(c)) {
                checkConsonant = true;
            }
        }

        // 5. Must have at least one vowel and one consonant
        return checkVowel && checkConsonant;
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
