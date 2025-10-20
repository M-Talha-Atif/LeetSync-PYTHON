class Solution {
    // true && true is true
    public boolean wordBreak(String s, List<String> wordDict) {
        // character by character expanding for a string
        // break the string into partitions
        // no need to use all dictionary words
        // partition can be done from any index  
        Boolean[] memo = new Boolean[s.length() + 1];
        Set<String> wordDic = new HashSet<String>();
        for ( String word: wordDict){
            wordDic.add(word);
        }

        return wordBreak(s,wordDic,0, memo);
    }
    private boolean wordBreak(String s, Set<String> wordDict, int start, Boolean[] memo) {
        // break the string into partitions
        // no need to use all dictionary words
        // partition can be done from any index 

        // base cases
        if ( start == s.length()){
            return true;
        }
         if ( start > s.length()){
            return false;
        }

        if (memo[start] != null) return memo[start];

        for (int end=start; end<s.length(); end++){

            if ( wordDict.contains(s.substring(start,end+1)) && wordBreak(s,wordDict,end+1, memo)){
                return memo[start]=true;
            }  
        }
        // no combination found
        return memo[start] = false; 
    }
}