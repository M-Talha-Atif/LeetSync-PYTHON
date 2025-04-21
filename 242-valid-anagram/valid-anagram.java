class Solution {

      // To sort a string alphabetically
    public static String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        return new String(tempArray);
    }

    public boolean isAnagram(String s, String t) {

        return sortString(s).equals(sortString(t));
        
    }
}