class Solution {
    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<String>();

        int i = 0; 
        int n = path.length();

        String res = "";

        while ( i < n ) {

            char ch = path.charAt(i);

            if (ch == '/') {
                i+=1;
                continue;
            }

            StringBuilder builder = new StringBuilder();

            builder.append(path.charAt(i) );
            while( i+1 < n && path.charAt(i+1) != '/' ) {
                builder.append(path.charAt(i+1) );
                i+=1;
            }

            String temp = builder.toString();
            
            System.out.println(temp);
            System.out.println(stack);

            if (temp.equals(".")) { 
                i+=1; 
                continue; }

            if (temp.equals("..") ) {

                if(!stack.isEmpty())   {  stack.pop();  }

                    
                i+=1;
                continue;
            }

            stack.push(temp.toString());


            


            i+=1; // move to next character
            

        }

        if (stack.isEmpty()){
             return "/";

        }


        while(!stack.isEmpty()){

            res = "/" + stack.pop() + res;

        }


      
        return res;
           
        
    }
}