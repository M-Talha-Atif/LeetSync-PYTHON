class Solution {
    // ae, ad, ah
    // 2 letters why because 2 digits

    List<String> res;
    int n;


    public List<String> letterCombinations(String digits) {
        n = digits.length();
        res = new ArrayList<>();
        if (n == 0){
            return res;
        }
        HashMap<Character, String> keyboard = new HashMap<>();
        
        keyboard.put('2', "abc");
        keyboard.put('3', "def");
        keyboard.put('4', "ghi");
        keyboard.put('5', "jkl");
        keyboard.put('6', "mno");
        keyboard.put('7', "pqrs");
        keyboard.put('8', "tuv");
        keyboard.put('9', "wxyz");
        // index increment for digit
        backTrack(keyboard, 0,  new StringBuilder(),  digits );

        return res;
    }

    public void backTrack (HashMap<Character, String> keyboard, int index, StringBuilder current, String digits ){
        if ( index == n ){
           res.add ( current.toString() );
           return;
        }
        // current key letters abc
        String letters = keyboard.get(digits.charAt(index));

        for ( char letter : letters.toCharArray()) {
           
           // add letter
            current.append(letter);

            // back track
            backTrack(keyboard, index+1,  current,  digits );

            // remove last explored option
            current.deleteCharAt( current.length() - 1);

        }
    }





}