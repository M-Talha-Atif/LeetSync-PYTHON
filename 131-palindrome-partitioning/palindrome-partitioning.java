class Solution {
    // a , a , b
    // aa, aab
    // aab
    // if substring palindrome then move on to explore path
    // 0 -> 00, 01, 02
    // 1 -> 12, 123 so one
    // 2 -> 23, 24, 25
    int n;
    public List<List<String>> partition(String s) {
        // har palindrome k depth m jao
        n = s.length();
        List<List<String>> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        backTrack(ans, temp, s, 0);
        return ans;
        
    }

    public boolean isPalindrome( String s, int l, int r)
    {
        int left = l;
        int right = r;

        while ( left < right ){
            if ( s.charAt(left) != s.charAt(right) ){
                 return false;
            }
            left+=1;
            right-=1;
        }

        return true;
    }

    public void backTrack(List<List<String>> ans, List<String> temp, String s, int index ){
        if ( index == n){
             ans.add(new ArrayList<>(temp)); // new arraylist so that we dont add it as reference, add its copy
        }
        for ( int i=index; i< s.length(); i++){

             if (isPalindrome(s, index, i)) {
                temp.add(s.substring(index, i + 1));
                backTrack(ans, temp, s, i + 1);
                temp.remove(temp.size() - 1);
            }

        }
    }
}