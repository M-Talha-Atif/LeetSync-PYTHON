class WordDictionary {
    private WordDictionary[] children;
    boolean leafNode;

    public WordDictionary() {
        children = new WordDictionary[26];
        leafNode = false;
    }
    
    // Adds a word into trie
    public void addWord(String word) {

        WordDictionary current = this;

        for(char c: word.toCharArray()){

            if(current.children[c - 'a'] == null)
                current.children[c - 'a'] = new WordDictionary();
            current = current.children[c - 'a'];

        }
        current.leafNode = true;
    }
    
    public boolean search(String word) {
        WordDictionary current = this;

        // dfs for dot part

        for(int i = 0; i < word.length(); ++i){
            char c = word.charAt(i);

            if(c == '.'){
                for(WordDictionary ch: current.children)
                    if(ch != null && ch.search(word.substring(i+1))) return true;
                return false;
            }

            // rest same logic
            if(current.children[c - 'a'] == null) return false;
            current = current.children[c - 'a'];
        }


        return current.leafNode;
    }
}