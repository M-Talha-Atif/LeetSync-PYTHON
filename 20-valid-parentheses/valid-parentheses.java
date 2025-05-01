class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack();

        if(s.length()==1) return false;

        for(char c : s.toCharArray()) {

            if( c=='(' || c=='{' || c=='[' )
            {
                stack.push(c);
            }

            else {
                
                if(stack.isEmpty()) return false;

                char check = stack.pop();

                if( c==')' && check!='(' )
                {
                 return false;
                }
                  if( c=='}' && check!='{' )
                {
                 return false;
                }
                  if( c==']' && check!='[' )
                {
                 return false;
                }
                   


            }



        }
        return stack.isEmpty();


        
    }
}