class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();

        int result = 0;

        for (String str : operations)
        
        {

            if (str.equals("+"))
            
            {  // top and second

                int top = stack.peek(); 

                int second = stack.get(stack.size() - 2);

                int total = top + second;
                stack.push(total);

            }

            else if (str.equals("C")) 
            {
                stack.pop();
            }

            else if( str.equals("D"))
            {
                int peek = stack.peek();
                int res = peek * 2;

                stack.push(res);
            }

            else 
            
            {
                stack.push(Integer.valueOf(str));
            }

        }

        while(!stack.isEmpty()){
            result += stack.pop();
        }
        return result;
        
    }
}