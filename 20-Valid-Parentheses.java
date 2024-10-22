class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray())
        {
            
            if(ch=='('||ch=='['||ch=='{')
            {
                stack.push(ch);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                if(ch==')' && stack.peek()=='(')
                {
                    stack.pop();
                }
                else if(ch==']' && stack.peek()=='[')
                {
                     stack.pop();
                }
                else if(ch=='}'&& stack.peek()=='{')
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
        }
            if(stack.empty())
            {
                return true;
            }
            else
            {
                return false;
            }
    }
    
}